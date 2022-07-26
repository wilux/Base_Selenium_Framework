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



        //Login
        Login login = new Login ( driver );
        login.Ingresar ( "QA" );

        Acciones acciones = new Acciones ( driver );


        //Probar Ctrol + Enter
        acciones.keyboard ().Ctrl ( 's' );


    }
}
