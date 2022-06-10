package TestCase;

import Page.LoginPage;
import org.junit.jupiter.api.Test;



public class InicioTest extends BaseTest{


    @Test
    //Tests google calculator
    public void Login() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        login.Ingresar();

        }
    }
