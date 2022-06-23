package Action;

import Tools.Frame;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Write {
    WebDriver driver;


    public Write(WebDriver driver) {

        this.driver = driver;

    }

    public void On(By locator, String text) throws InterruptedException {
        Frame frame = new Frame(driver);
        Get get = new Get(driver);
        Boolean cambio = false;
        Stopwatch stopwatch;
        stopwatch = Stopwatch.createStarted();
        do {
            if (frame.BuscarFrame(locator)) {
                try {
                    driver.findElement(locator).clear();
                    driver.findElement(locator).sendKeys(text);
                    cambio = true;
                    break;
                }catch (Exception e) {
                    continue;
                }
            }
        }
        while (stopwatch.elapsed(TimeUnit.SECONDS) < 5);
            if (!cambio) {
            System.out.println("No se encontró " + locator);
        }
            }
        }


