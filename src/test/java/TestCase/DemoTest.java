package TestCase;

import Config.Acciones;
import Config.BaseTest;
import Page.HomePage;
import Tools.logs.Log;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoTest extends BaseTest {

    @Test(description = "Prueba de Randon Demo")
    public void randmon()  throws InterruptedException {
        //ExtentReports Description
        //Log.reportLog ( "Prueba Random - Test en un Demo Site" );

        HomePage homePage = new HomePage(driver);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        driver.findElement(homePage.menuPhones).click();
        Thread.sleep(2000);
        driver.findElement(homePage.menuLaptos).click();
        Thread.sleep(2000);
        driver.findElement(homePage.menuMonitors).click();


        String elemento = driver.findElement(By.xpath("//a[.='Apple monitor 24']")).getText();
        Assert.assertEquals(elemento,"Apple monitor 24");

    }
}
