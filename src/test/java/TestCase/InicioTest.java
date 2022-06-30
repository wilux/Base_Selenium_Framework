package TestCase;

import Config.BaseTest;
import Page.LoginPage;
import Task.Login;
import org.testng.annotations.Test;


public class InicioTest extends BaseTest {


    @Test
    //Tests google calculator
    public void Login() throws InterruptedException {

        Login login = new Login ( driver );
        login.Ingresar ();

    }
}
