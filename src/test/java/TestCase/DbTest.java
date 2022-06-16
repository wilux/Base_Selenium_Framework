package TestCase;

import Page.LoginPage;
import Tools.SQLDatabaseConnection;
import org.testng.annotations.Test;


public class DbTest {


    @Test
    //Tests google calculator
    public void Conection() throws InterruptedException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection();
        bd.CambiarUsuario("BOUZASC");

        }
    }


