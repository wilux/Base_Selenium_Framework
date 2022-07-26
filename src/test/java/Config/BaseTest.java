package Config;


import Tools.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

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
    public void before() {
        Log.info ( "Tests is starting!" );
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }


    @AfterSuite
    public void after() throws IOException, URISyntaxException {

        Desktop.getDesktop ().open ( new File ( "TestReport/Test-Automaton-Report.html" ) );
//        Log.info ( "Tests are ending!" );
//        if ( driver != null ) {
//            driver.quit ();
//        }
    }


}