package TestCase.E2E;

import Config.Acciones;
import Config.BaseTest;
import Tools.SQLDatabaseConnection;
import Tools.logs.Log;
import com.google.common.base.Stopwatch;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WorkFlowVentaE2ETest extends BaseTest {

//    //Datos del caso
//    String cuil = "27350672155 ";
//    String NroEntrevista = "1283763";
//    String usuarioPlataforma = "SERPILLOE";
//    String usuarioGerencia = "RODRIGUA";
//    String usuarioCreditos = "PIANCIOLAG";
//    String usuarioCentral = "LOMBERAM";
//
//
//    @BeforeTest
//    public void IniciarSimulacion() throws InterruptedException, AWTException {
//
//        //Instanciamos clases que usaremos
//        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
//        Acciones acciones = new Acciones ( driver );
//
//        //Inicio Como usuario de Plataforma
//        bd.CambiarUsuario ( usuarioPlataforma );
//
//
//        //Logueamos
//        acciones.login ().Ingresar ( "QA" );
//
//        //Menu Ejecutar
//        acciones.menu ().Ejecutar ();
//        //Abrir BandejaTareas
//        acciones.ejecutar ().Programa ( "hxwf900" );
//        System.out.println ( "Driver Inicial " + driver.toString () );
//
//    }
//
//    @Test(priority = 0, enabled = true)
//    //@Test(priority = 0)
//    public void Bandeja() throws InterruptedException {
//        Log.reportLog ( "Step 1 - Abrimos Bandeja Tareas e Iniciamos Entrevista" );
//        Acciones acciones = new Acciones ( driver );
//
//        //Abrir Entrevista Nueva
//        acciones.bandejaTareas ().iniciarEntrevista ( "Entrevista / Identificación" );
//
//
//        //Ingresar Tipo y Documento
//        Log.reportLogScreen ( driver );
//        acciones.entrevista ().IdentificacionPersona ( "C.U.I.L.", cuil );
//        //Entrevista
//        acciones.entrevista ().CompletarGenerico ();
//        //Guardar Nro Entrevista
//        NroEntrevista = acciones.entrevista ().NroEntrevista ();
//        System.out.println ( "Entrevista Nro: " + NroEntrevista );
//
//
//        //Si la entrevista retorna un error detenemos sino continuamos
//        if ( acciones.entrevista ().Error () ) {
//            System.out.println ( "Existen errores con la Entrevista" );
//            Assert.fail ();
//        }
//        else {
//            acciones.entrevista ().Cerrar ();
//            Assert.assertTrue ( true );
//            acciones.bandejaTareas ().siguienteEntrevista ( NroEntrevista );
//
//        }
//
//    }
//
//    @Test(priority = 1, enabled = true)
//    public void Simulacion() throws InterruptedException {
//
//        Log.reportLog ( "Step 2 - Iniciamos Simulacion" );
//        Acciones acciones = new Acciones ( driver );
//
//        //ejecutamos de la bandeja el tramite
//        acciones.bandejaTareas ().ejecutarEntrevista ( NroEntrevista );
//
//        //Lista de Paquete
//        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
//                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );
//
//        //Elegimos Paquete 2 -> BPN PLUS
//        acciones.simulacion ().Paquete ( paquetes.get ( 2 ) );
//
//        //Linea
//        acciones.simulacion ().Linea ( "309201" );
//
//        //Monto
//        acciones.simulacion ().Monto ( "1000" );
//
//        //Plazo
//        acciones.simulacion ().Plazo ( "12" );
//
//        //Destino
//        acciones.simulacion ().DestinoFondos ( "1" );
//
//        //Tarjetas Paquete
//        acciones.simulacion ().Tarjetas ();
//
//        //Simular
//        acciones.simulacion ().Simular ();
//        Log.reportLogScreen ( driver );
//        //Confirmar
//        acciones.simulacion ().Confirmar ();
//
//        Assert.assertTrue ( acciones.get ().Existe ( acciones.simulacion ().BTNOPCOMISION ) );
//
//    }
//
//    @Test(priority = 2, enabled = true)
//    public void ConfirmarPlanDePagos() throws InterruptedException {
//        Log.reportLog ( "Step 3 - Confirmar Plan de Pagos Amortizable" );
//        Acciones acciones = new Acciones ( driver );
//        Log.reportLogScreen ( driver );
//        acciones.simulacion ().ConfirmarPlanPago ();
//        Assert.assertTrue ( acciones.get ().Existe ( acciones.simulacion ().BTNOPCARTASIMULADOR ) );
//    }
//
//    @Test(priority = 3, enabled = true)
//    public void ConfirmarSimulacion() throws InterruptedException {
//        Log.reportLog ( "Step 4 - Confirmar Simulacion" );
//        Acciones acciones = new Acciones ( driver );
//        Log.reportLogScreen ( driver );
//        acciones.simulacion ().ConfirmarSimulacion ();
//        Assert.assertTrue ( acciones.get ().Existe ( acciones.bandejaTareas ().BTNOPOEJECUTAR ) );
//    }
//
//    @Test(priority = 4, enabled = true)
//    public void CargaAvanzada() throws InterruptedException, ParseException {
//
//        Log.reportLog ( "Step 5 - Confirmar Carga Avanzada" );
//
//        Acciones acciones = new Acciones ( driver );
//        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
//
//        //Remotar tramite
//        //acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );
//        acciones.bandejaTareas ().tomarEntrevista ( NroEntrevista );
//
//
//        //Hacer World Complement
//        bd.wc ( cuil );
//
//        //Confirmar
//        Log.reportLogScreen ( driver );
//        acciones.cargaAvanzada ().Aceptar ();
//
//        Assert.assertTrue ( acciones.get ().Existe ( acciones.bandejaTareas ().BTNOPOEJECUTAR ) );
//    }
//
//    @Test(priority = 5, enabled = true)
//    public void Reutilizacion() throws InterruptedException {
//
//        Log.reportLog ( "Step 6 - Confirmar Reutilizacion" );
//
//        Acciones acciones = new Acciones ( driver );
//
//        //Remotar tramite
//        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );
//
//        //Aceptar TD
//        acciones.reutilizacion ().AceptarTarjetaDebito ();
//        Log.reportLogScreen ( driver );
//
//        //Entrar a Perfil Riesgo
//        acciones.reutilizacion ().PerfilRiesgo ();
//
//        Assert.assertTrue ( acciones.get ().Existe ( acciones.matrizRiesgo ().GRIDSUBINTEGRANTES ) );
//    }
//
//    @Test(priority = 6, enabled = true)
//    public void MatrizRiesgo() throws InterruptedException, AWTException, SQLException {
//
//        Log.reportLog ( "Step 7 - Confirmar Matriz Riesgo" );
//
//        Acciones acciones = new Acciones ( driver );
//        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
//
//        //Aceptar Perfil Riesgo
//        acciones.matrizRiesgo ().Confirmar ();
//        Log.reportLogScreen ( driver );
//        //Esperar que los formularios esten para completar
//        final Stopwatch stopwatch = Stopwatch.createStarted ();
//        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
//            System.out.print ( "Esperando generacion de formularios..." );
//            do {
//                System.out.println ( "." );
//            } while (bd.esperarFormularios ( "27350672155" ) != true || (stopwatch.elapsed ( TimeUnit.SECONDS ) < 360));
//            System.out.println ( "Tiempo transcurrido: " + stopwatch.elapsed ( TimeUnit.SECONDS ) );
//            System.out.print ( "Legajo creado, empezando a firmar..." );
//            //Firmamos LD
//            bd.completarLD ( cuil );
//        }
//        Assert.assertTrue ( true );
//    }
//
//    @Test(priority = 7, enabled = true, dependsOnMethods = "MatrizRiesgo")
//    public void RevisionGerente() throws InterruptedException, SQLException, AWTException {
//
//        Log.reportLog ( "Step 8 - Confirmar desde Gerente" );
//
//        //Cerrar y entrar como nuevo usuario
//        Restart restart = new Restart ( driver );
//        driver = restart.As ( usuarioGerencia );
//
//        System.out.println ( "Driver Gerencia " + driver.toString () );
//        //Instanciamos clases que usaremos
//        Acciones acciones = new Acciones ( driver );
//
//        //Menu Ejecutar
//        acciones.menu ().Ejecutar ();
//        //Abrir BandejaTareas
//        acciones.ejecutar ().Programa ( "hxwf900" );
//
//
//        //Remotar tramite
//        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );
//        Log.reportLogScreen ( driver );
//        //Confirmo Revision de Productos
//        acciones.revisionProductos ().Confirmar ();
//
//
//        Assert.assertTrue ( true );
//    }
//
//
//    //Solo cuando excede Limite sino se saltar paso
//    @Test(priority = 8, enabled = false, dependsOnMethods = "RevisionGerente")
//    public void RevisionCreditos() throws InterruptedException, SQLException, AWTException {
//
//        Log.reportLog ( "Step 9 - Confirmar desde Creditos" );
//        System.out.println ( "Driver Creditos " + driver.toString () );
//
//        Thread.sleep ( 5000 );
//        //Reiniciamos con nuevo usuario
//        Restart restart = new Restart ( driver );
//        driver = restart.As ( usuarioCreditos );
//
//        //Instanciamos clases que usaremos
//        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
//        Acciones acciones = new Acciones ( driver );
//
//        //Menu Ejecutar
//        acciones.menu ().Ejecutar ();
//        //Abrir BandejaTareas
//        acciones.ejecutar ().Programa ( "hxwf900" );
//
//        //Remotar tramite
//        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );
//        Log.reportLogScreen ( driver );
//        //Confirmo Revision de Productos
//        acciones.revisionProductos ().Confirmar ();
//
//
//        Assert.assertTrue ( true );
//    }
//
//    @Test(priority = 9, enabled = true, dependsOnMethods = "RevisionGerente")
//    public void Liquidacion() throws InterruptedException, SQLException, AWTException {
//
//        Log.reportLog ( "Step 10 - Liquidar producto" );
//
//
//        //Reiniciamos con nuevo usuario
//        Thread.sleep ( 5000 );
//        Restart restart = new Restart ( driver );
//        driver = restart.As ( usuarioCentral );
//        Thread.sleep ( 5000 );
//        System.out.println ( "Driver Central " + driver.toString () );
//        //Instanciamos clases que usaremos
//        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
//        Acciones acciones = new Acciones ( driver );
//
//        //Menu Ejecutar
//        acciones.menu ().Ejecutar ();
//        //Abrir BandejaTareas
//        acciones.ejecutar ().Programa ( "hxwf900" );
//
//        //Remotar tramite
//        acciones.bandejaTareas ().avanzarEntrevista ( NroEntrevista );
//        Log.reportLogScreen ( driver );
//        //Confirmo Revision de Productos
//        acciones.revisionParaConfirmar ().Confirmar ();
//
//        //Perfil Riesgo
//        Log.reportLogScreen ( driver );
//        acciones.revisionParaConfirmar ().PerfilRiesgo ();
//
//        //Confirmar Matriz Final
//        Log.reportLogScreen ( driver );
//        acciones.matrizRiesgo ().ConfirmarFinal ();
//
//        //Liquidar
//        Log.reportLogScreen ( driver );
//        acciones.revisionParaConfirmar ().Liquidar ();
//
//        Assert.assertTrue ( true );
//    }
//
//    @Test(priority = 10, enabled = true, dependsOnMethods = "Liquidacion")
//    public void PlandePagos() throws InterruptedException, SQLException {
//        Log.reportLog ( "Step 11 - Plan de Pagos Amortizable" );
//        Acciones acciones = new Acciones ( driver );
//
//        acciones.planPagosAmortizables ().Confirmar ();
//        Log.reportLogScreen ( driver );
//
//        acciones.planPagosAmortizables ().VinculaGarantia ();
//        Log.reportLogScreen ( driver );
//
//        Assert.assertTrue ( true );
//    }

}
