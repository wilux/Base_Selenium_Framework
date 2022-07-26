package Config;


import Tools.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


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
//        System.setProperty ( "webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe" );
//        System.setProperty ( "webdriver.msedgedriver.driver", "C:\\webdriver\\msedgedriver.exe" );
//        System.setProperty ( "webdriver.geckodriver.driver", "C:\\webdriver\\geckodriver.exe" );
        System.setProperty ( "webdriver.chromedriver.driver", "C:\\webdriver\\chromedriver.exe" );
        driver = new ChromeDriver ();
    }


    @AfterSuite
    public void after() throws IOException, URISyntaxException {


        Desktop.getDesktop ().open ( new File ( "C:\\Users\\floresnes\\source\\repos\\BT_Selenium_Java_Maven" +
                                                        "\\TestReport\\Test-Automaton-Report.html" ) );
        Log.info ( "Tests are ending!" );
        if ( driver != null ) {
            driver.quit ();
        }
    }


}