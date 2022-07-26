package Config;


import Tools.logs.Log;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;


public abstract class BaseTest {

    public WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver newDriver) {
        driver = newDriver;
    }


    @BeforeSuite
    public void beforeAll() {
//        Log.info ( "Tests is starting!" );
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        driver = new ChromeDriver (options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    }


@BeforeTest
    public void beforeTest() {

//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
//        driver = new ChromeDriver (options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }



    @AfterTest
    public void afterTest() throws IOException {

//
//        if ( driver != null ) {
//            driver.quit ();
//        }
    }


    @AfterSuite
    public void afterAll() throws IOException {

        //Desktop.getDesktop ().open ( new File ( "TestReport/Test-Automaton-Report.html" ) );
//        Log.info ( "Tests are ending!" );
    }


}