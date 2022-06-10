package TestCase;

import UI.EjecutarPage;
import UI.LoginPage;
import UI.MenuPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class LoginTest {


    @Test
    //Tests google calculator
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");

        InternetExplorerOptions ieOptions = new InternetExplorerOptions();

        //ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        //ieOptions.attachToEdgeChrome();

        ieOptions.ignoreZoomSettings();
        ieOptions.setCapability("ignoreProtectedModeSettings", true);


        WebDriver driver = new InternetExplorerDriver(ieOptions);


        driver.get("http://btwebqa.ar.bpn/BTWeb/hlogin.aspx");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("floresnes");
        loginPage.setPassword("Cogito78-");
        loginPage.LoginButton();

        Thread.sleep(200);

        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(driver.getWindowHandles().size() - 1));

        Thread.sleep(200);

        driver.manage().window().maximize();


        MenuPage menu = new MenuPage(driver);
            while (true) {
                try {
                    menu.Ejecutar();
                    break;

                } catch (Exception e) {
                    Thread.sleep(200);
                    continue;
                }
            }

        EjecutarPage ejecutar = new EjecutarPage(driver);
            ejecutar.Programa("hbnqgc30");

        }
    }
