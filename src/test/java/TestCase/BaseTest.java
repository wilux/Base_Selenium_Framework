package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    //Tests google calculator
    public static void before() throws InterruptedException {

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
        driver.quit();
        }

    }
