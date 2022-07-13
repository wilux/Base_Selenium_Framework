package TestCase;

import Config.Acciones;
import Config.BaseTest;
import Task.*;
import Tools.SQLDatabaseConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;


public class KeyboardsTest extends BaseTest {


    @Test
    public void Completar() throws InterruptedException, AWTException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( "SERPILLOE" );

        //Login
        Login login = new Login ( driver );
        login.Ingresar ( "QA" );

        Acciones acciones = new Acciones ( driver );

        //Menu Ejecutar
        acciones.menu ().Ejecutar ();
        //Abrir BandejaTareas
        acciones.ejecutar ().Programa ( "hxwf900" );

        //Probar Ctrol + Enter
        acciones.keyboard ().Ctrl ( 's' );


    }
}
