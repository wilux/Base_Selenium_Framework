package Config;


import Tools.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;


public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void before() throws InterruptedException {
        Log.info ( "Tests is starting!" );

        System.setProperty ( "webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe" );
        //System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");

        InternetExplorerOptions ieOptions = new InternetExplorerOptions ();

        //ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        //ieOptions.attachToEdgeChrome();

        ieOptions.ignoreZoomSettings ();
        ieOptions.setCapability ( "ignoreProtectedModeSettings", true );


        driver = new InternetExplorerDriver ( ieOptions );
        //driver.manage ().timeouts ().implicitlyWait ( 5, TimeUnit.SECONDS );


    }

    @AfterClass
    public void after() {
        Log.info ( "Tests are ending!" );
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
        driver.quit ();

    }


    public WebDriver getDriver() {
        return this.driver;
    }
}
