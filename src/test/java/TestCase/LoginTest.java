package TestCase;

import Config.BaseTest;
import Page.HomePage;
import Task.Home;
import Task.Login;
import Tools.logs.Log;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

import static Tools.extentreports.ExtentTestManager.startTest;


public class LoginTest extends BaseTest {


    @Test(priority = 0, description = "Prueba de Login correcto")
    //Tests google calculator
    public void Login(Method method) throws InterruptedException {


        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        Home home    = new Home(driver);
        Login login = new Login(driver);

        home.login();
        login.setUserName("test");
        login.setPassword("test");
        login.loginButton();
        Thread.sleep(2000);
        Assert.assertTrue(login.loginSuccessful());



    }

    @Test(priority = 1, description = "Prueba de Login incorrecto")
    //Tests google calculator
    public void LoginIncorrect(Method method) throws InterruptedException {


        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        Home home    = new Home(driver);
        Login login = new Login(driver);

        home.login();
        login.setUserName("test");
        login.setPassword("1212");
        login.loginButton();
        Thread.sleep(2000);
        Assert.assertTrue(login.loginUnSuccessful());


    }


}
