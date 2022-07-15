package Config;


import Tools.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
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
        System.setProperty ( "webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe" );
        driver = new InternetExplorerDriver ();
    }


    @AfterSuite
    public void after() throws IOException, URISyntaxException {

//
        Desktop.getDesktop ().open ( new File ( "C:\\Users\\floresnes\\source\\repos\\BT_Selenium_Java_Maven" +
                                                        "\\TestReport\\Test-Automaton-Report.html" ) );
        Log.info ( "Tests are ending!" );
        if ( driver != null ) {
            driver.quit ();
        }
    }
//        JFrame jf = new JFrame ();
//        jf.setAlwaysOnTop ( true );
//        int reply = JOptionPane.showConfirmDialog ( jf, "¿Queres Cerrar Navegador?", "Test Terminado",
//                                                    JOptionPane.YES_NO_OPTION );
//
//        if ( reply == JOptionPane.YES_OPTION ) {
//            driver.quit ();
//
//        }
//        else {
//            System.exit ( 0 );
//        }
//}


}