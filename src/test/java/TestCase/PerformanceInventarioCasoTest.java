package TestCase;


import UI.EjecutarPage;
import UI.LoginPage;
import org.junit.jupiter.api.Test;


public class PerformanceInventarioCasoTest extends BaseTest{


    @Test
    //Tests google calculator
    public void Login() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        EjecutarPage ejecutar = new EjecutarPage(driver);


        login.Ingresar();
        ejecutar.Programa("hbnqgc30");


        }
    }
