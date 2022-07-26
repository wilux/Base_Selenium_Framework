package TestCase;

import Config.Acciones;
import Config.BaseTest;
import Page.HomePage;
import Tools.logs.Log;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static Tools.extentreports.ExtentTestManager.startTest;


public class demoSite extends BaseTest {

    @Test(priority = 0, description = "Prueba de Randon Demo")
    public void randmon(Method method)  throws InterruptedException {
        //ExtentReports Description
        Log.reportLog ( "Prueba Random - Test en un Demo Site" );

        Acciones acciones = new Acciones(driver);
        HomePage homePage = new HomePage(driver);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        acciones.click().On(homePage.menuPhones);
        Thread.sleep(2000);
        acciones.click().On(homePage.menuLaptos);
        Thread.sleep(2000);
        acciones.click().On(homePage.menuMonitors);

        String elemento = acciones.get().TextOnTag(By.xpath("//a[.='Apple monitor 24']"));
        Assert.assertTrue(elemento.equals("Apple monitor 24"));

    }
}
