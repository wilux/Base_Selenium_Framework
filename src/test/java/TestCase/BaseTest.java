package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;


public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
        public  void before() throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");

        InternetExplorerOptions ieOptions = new InternetExplorerOptions();

        //ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        //ieOptions.attachToEdgeChrome();

        ieOptions.ignoreZoomSettings();
        ieOptions.setCapability("ignoreProtectedModeSettings", true);


         driver = new InternetExplorerDriver(ieOptions);

        }
        @AfterSuite
        public static void after() throws InterruptedException {

//            int reply = JOptionPane.showConfirmDialog(null, "¿Queres Cerrar Navegador?", "Test Terminado", JOptionPane.YES_NO_OPTION);
//            if (reply == JOptionPane.YES_OPTION) {
//                driver.quit();
//
//            } else {
//                System.exit(0);
//            }



        }

    public static void iniciar()  {

        System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe");
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.ignoreZoomSettings();
        ieOptions.setCapability("ignoreProtectedModeSettings", true);
        driver = new InternetExplorerDriver(ieOptions);

    }

    }
