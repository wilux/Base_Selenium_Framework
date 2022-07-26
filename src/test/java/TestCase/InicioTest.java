package TestCase;

import Config.BaseTest;
import Task.Login;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static Tools.extentreports.ExtentTestManager.startTest;


public class InicioTest extends BaseTest {


    @Test(priority = 0, description = "Prueba de Login correcto")
    //Tests google calculator
    public void Login(Method method) throws InterruptedException, AWTException {

        //ExtentReports Description
        startTest ( method.getName (), "Valid Login Scenario with valid username and password." );



    }


}
