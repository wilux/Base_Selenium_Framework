package TestCase;

import UI.LoginPage;
import org.junit.jupiter.api.Test;



public class InicioTest extends BaseTest{


    @Test
    //Tests google calculator
    public void Login() {

        LoginPage login = new LoginPage(driver);
        login.Ingresar();

        }
    }
