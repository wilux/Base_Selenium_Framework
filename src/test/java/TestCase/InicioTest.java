package TestCase;

import Config.BaseTest;
import Page.LoginPage;
import org.testng.annotations.Test;


public class InicioTest extends BaseTest {


    @Test
    //Tests google calculator
    public void Login() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        login.Ingresar();

        }
    }
