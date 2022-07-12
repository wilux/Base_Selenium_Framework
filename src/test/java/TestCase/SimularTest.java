package TestCase;

import Config.BaseTest;
import Config.Accion;
import Tools.SQLDatabaseConnection;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimularTest extends BaseTest {


    @Test
    //Tests google calculator
    public void Simular() throws InterruptedException {

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );

        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( "SERPILLOE" );

        //Logueamos
        accion.login ().Ingresar ( "QA" );

        //Menu Ejecutar
        accion.menu ().Ejecutar ();
        //Abrir BandejaTareas
        accion.ejecutar ().Programa ( "hxwf900" );

        //Abrir Entrevista
        accion.bandejaTareas ().iniciarEntrevista ( "Entrevista / Identificación" );


        //Ingresar Tipo y Documento
        accion.entrevista ().IdentificacionPersona ( "C.U.I.L.", "23353071459 " );
        //Entrevista
        accion.entrevista ().CompletarGenerico ();
        //Guardar Nro Entrevista
        String NroEntrevista = accion.entrevista ().NroEntrevista ();
        System.out.println ( "Entrevista Nro: " + NroEntrevista );


        //Si la entrevista retorna un error detenemos sino continuamos
        if ( accion.entrevista ().Error () ) {
            System.out.println ( "Existen errores con la Entrevista" );
            Assert.fail ();
        }
        else {
            accion.entrevista ().Cerrar ();
            accion.bandejaTareas ().siguienteEntrevista ( NroEntrevista );
            accion.bandejaTareas ().ejecutarEntrevista ( NroEntrevista );
        }

        //Si llegamos hasta la pantalla de simulacion la prueba fue exitosa.
        Assert.assertTrue ( accion.simulacion ().Existe () );

    }
}
