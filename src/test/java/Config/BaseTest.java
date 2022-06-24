package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void before() throws InterruptedException {

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

    @AfterSuite
    public void after() throws InterruptedException {

//            int reply = JOptionPane.showConfirmDialog(null, "¿Queres Cerrar Navegador?", "Test Terminado", JOptionPane.YES_NO_OPTION);
//            if (reply == JOptionPane.YES_OPTION) {
//                driver.quit();
//
//            } else {
//                System.exit(0);
//            }


    }

//    public void iniciar() {
//
//        System.setProperty ( "webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe" );
//        InternetExplorerOptions ieOptions = new InternetExplorerOptions ();
//        ieOptions.ignoreZoomSettings ();
//        ieOptions.setCapability ( "ignoreProtectedModeSettings", true );
//        driver = new InternetExplorerDriver ( ieOptions );
//        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
//
//    }

}
