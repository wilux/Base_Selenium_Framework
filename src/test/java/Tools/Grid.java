package Tools;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Grid {
    WebDriver driver;

    public Grid(WebDriver driver) {

        this.driver = driver;

    }

    public void rowSelectbyText(By locator, String valor)
    {
        // Crea e inicia un nuevo cronómetro
        Stopwatch stopwatch;
        stopwatch = Stopwatch.createStarted();
        Frame frame = new Frame(driver);
         if (frame.BuscarFrame(locator)) {

             while (stopwatch.elapsed(TimeUnit.SECONDS) < 5) {
                 try {
                     WebElement webElement = driver.findElement(locator);
//                   webElement.findElement(By.xpath("//span[text()='" + valor + "']")).click();
                     WebElement span = webElement.findElement(By.xpath("//span[contains(text(),'"+valor+"')]"));
                     span.click();
                     stopwatch.stop();
                     break;
                 } catch (Exception e) {
                     System.out.println(e);
                     continue;
                 }
             }

             if (stopwatch.isRunning()) {
                 stopwatch.stop();
             }
             System.out.println("Tiempo Select " + stopwatch.elapsed(TimeUnit.SECONDS) + " segundos.");
         }

    }


    public void rowSelectbyFila(By locator, By fila)
    {
        // Crea e inicia un nuevo cronómetro
        Stopwatch stopwatch;
        stopwatch = Stopwatch.createStarted();
        Frame frame = new Frame(driver);
        if (frame.BuscarFrame(locator)) {

            while (stopwatch.elapsed(TimeUnit.SECONDS) < 5) {
                try {
                    WebElement webElement = driver.findElement(locator);
                    webElement.findElement(fila).click();
                    stopwatch.stop();
                    break;
                } catch (Exception e) {
                    System.out.println(e);
                    continue;
                }
            }

            if (stopwatch.isRunning()) {
                stopwatch.stop();
            }
            System.out.println("Tiempo Select " + stopwatch.elapsed(TimeUnit.SECONDS) + " segundos.");
        }

    }

}
