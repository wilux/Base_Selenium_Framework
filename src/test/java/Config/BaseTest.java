package Config;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public abstract class BaseTest {

    public WebDriver driver;
    public JavascriptExecutor js;
    public Map<String, Object> vars;


    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }


    @BeforeSuite
    public void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1072, 1020));
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