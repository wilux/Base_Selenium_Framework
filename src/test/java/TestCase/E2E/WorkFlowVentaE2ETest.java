package TestCase.E2E;

import Config.Acciones;
import Config.BaseTest;
import Tools.SQLDatabaseConnection;
import Tools.logs.Log;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;


public class WorkFlowVentaE2ETest extends BaseTest {

    //Datos del caso
    String cuil = "27350672155 ";
    String NroEntrevista = "1283731";
    String usuarioPlataforma = "SERPILLOE";
    String usuarioGerencia = "RODRIGUA";
    String usuarioCreditos = "PIANCIOLAG";
    String usuarioCentral = "LOMBERAM";


    @BeforeTest
    public void IniciarSimulacion() {

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Acciones acciones = new Acciones ( driver );

        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( usuarioPlataforma );


        //Logueamos
        acciones.login ().Ingresar ( "QA" );

        //Menu Ejecutar
        acciones.menu ().Ejecutar ();
        //Abrir BandejaTareas
        acciones.ejecutar ().Programa ( "hxwf900" );


    }

    @Test(priority = 0, enabled = true)
    //@Test(priority = 0)
    public void Bandeja() throws InterruptedException {
        Log.reportLog ( "Step 1 - Abrimos Bandeja Tareas e Iniciamos Entrevista" );
        Acciones acciones = new Acciones ( driver );

        //Abrir Entrevista Nueva
        acciones.bandejaTareas ().iniciarEntrevista ( "Entrevista / Identificación" );


        //Ingresar Tipo y Documento
        acciones.entrevista ().IdentificacionPersona ( "C.U.I.L.", cuil );
        //Entrevista
        acciones.entrevista ().CompletarGenerico ();
        //Guardar Nro Entrevista
        NroEntrevista = acciones.entrevista ().NroEntrevista ();
        System.out.println ( "Entrevista Nro: " + NroEntrevista );


        //Si la entrevista retorna un error detenemos sino continuamos
        if ( acciones.entrevista ().Error () ) {
            System.out.println ( "Existen errores con la Entrevista" );
            Assert.fail ();
        }
        else {
            acciones.entrevista ().Cerrar ();
            Assert.assertTrue ( true );
            acciones.bandejaTareas ().siguienteEntrevista ( NroEntrevista );

        }

    }

    @Test(priority = 1, enabled = true)
    public void Simulacion() throws InterruptedException {

        Log.reportLog ( "Step 2 - Iniciamos Simulacion" );
        Acciones acciones = new Acciones ( driver );

        //ejecutamos de la bandeja el tramite
        acciones.bandejaTareas ().ejecutarEntrevista ( NroEntrevista );

        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 2 -> BPN PLUS
        acciones.simulacion ().Paquete ( paquetes.get ( 2 ) );

        //Linea
        acciones.simulacion ().Linea ( "309201" );

        //Monto
        acciones.simulacion ().Monto ( "10000" );

        //Plazo
        acciones.simulacion ().Plazo ( "24" );

        //Destino
        acciones.simulacion ().DestinoFondos ( "1" );

        //Tarjetas Paquete
        acciones.simulacion ().Tarjetas ();

        //Simular
        acciones.simulacion ().Simular ();

        //Confirmar
        acciones.simulacion ().Confirmar ();

        Assert.assertTrue ( true );

    }

    @Test(priority = 2, enabled = true)
    public void ConfirmarPlanDePagos() throws InterruptedException {
        Log.reportLog ( "Step 3 - Confirmar Plan de Pagos Amortizable" );
        Acciones acciones = new Acciones ( driver );
        acciones.simulacion ().ConfirmarPlanPago ();
        Assert.assertTrue ( true );
    }

    @Test(priority = 3, enabled = true)
    public void ConfirmarSimulacion() throws InterruptedException {
        Log.reportLog ( "Step 4 - Confirmar Simulacion" );
        Acciones acciones = new Acciones ( driver );
        acciones.simulacion ().ConfirmarSimulacion ();
        Assert.assertTrue ( true );
    }

    @Test(priority = 4, enabled = true)
    public void CargaAvanzada() throws InterruptedException, ParseException {

        Log.reportLog ( "Step 5 - Confirmar Carga Avanzada" );

        Acciones acciones = new Acciones ( driver );
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();

        //Remotar tramite
        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );

        //Hacer World Complement
        bd.wc ( cuil );

        //Confirmar
        acciones.cargaAvanzada ().Aceptar ();

        Assert.assertTrue ( true );
    }

    @Test(priority = 5, enabled = true)
    public void Reutilizacion() throws InterruptedException {

        Log.reportLog ( "Step 6 - Confirmar Reutilizacion" );

        Acciones acciones = new Acciones ( driver );

        //Remotar tramite
        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );

        //Aceptar TD
        acciones.reutilizacion ().AceptarTarjetaDebito ();

        //Entrar a Perfil Riesgo
        acciones.reutilizacion ().PerfilRiesgo ();

        Assert.assertTrue ( true );
    }

    @Test(priority = 6, enabled = true)
    public void MatrizRiesgo() throws InterruptedException {

        Log.reportLog ( "Step 7 - Confirmar Matriz Riesgo" );

        Acciones acciones = new Acciones ( driver );

        //Aceptar Perfil Riesgo
        acciones.matrizRiesgo ().Confirmar ();

        Assert.assertTrue ( true );
    }

    @Test(priority = 7, enabled = true)
    public void RevisionGerente() throws InterruptedException, SQLException {

        Log.reportLog ( "Step 8 - Confirmar desde Gerente" );

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Acciones acciones = new Acciones ( driver );

        //Firmamos LD
        bd.completarLD ( cuil );

        //Inicio Como usuario de Gerencia
        bd.CambiarUsuario ( usuarioGerencia );

        //Remotar tramite
        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );

        //Confirmo Revision de Productos
        acciones.revisionProductos ().Confirmar ();

        Assert.assertTrue ( true );
    }


    //Solo cuando excede Limite sino se saltar paso
    @Test(priority = 8, enabled = false)
    public void RevisionCreditos() throws InterruptedException, SQLException {

        Log.reportLog ( "Step 9 - Confirmar desde Creditos" );

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Acciones acciones = new Acciones ( driver );

        //Inicio Como usuario de Gerencia
        bd.CambiarUsuario ( usuarioCreditos );

        //Remotar tramite
        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );

        //Confirmo Revision de Productos
        acciones.revisionProductos ().Confirmar ();

        Assert.assertTrue ( true );
    }

    @Test(priority = 9, enabled = true)
    public void Liquidacion() throws InterruptedException, SQLException {

        Log.reportLog ( "Step 10 - Liquidar producto" );

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Acciones acciones = new Acciones ( driver );

        //Inicio Como usuario de Gerencia
        bd.CambiarUsuario ( usuarioCentral );

        //Remotar tramite
        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );

        //Confirmo Revision de Productos
        acciones.revisionParaConfirmar ().Confirmar ();

        //Perfil Riesgo
        acciones.revisionParaConfirmar ().PerfilRiesgo ();

        //Confirmar Matriz Final
        acciones.matrizRiesgo ().ConfirmarFinal ();

        //Liquidar
        acciones.revisionParaConfirmar ().Liquidar ();

        Assert.assertTrue ( true );
    }

    @Test(priority = 10, enabled = true)
    public void PlandePagos() throws InterruptedException, SQLException {
        Log.reportLog ( "Step 11 - Plan de Pagos Amortizable" );
        Acciones acciones = new Acciones ( driver );

        acciones.planPagosAmortizables ().Confirmar ();

        acciones.planPagosAmortizables ().VinculaGarantia ();

        Assert.assertTrue ( true );
    }

}
