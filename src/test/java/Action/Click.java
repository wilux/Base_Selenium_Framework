package Action;

import Tools.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {
    WebDriver driver;


    public Click(WebDriver driver) {

        this.driver = driver;

    }

    public void On(By locator) {
        Frame frame = new Frame(driver);
        try {
            if (frame.BuscarFrame(locator)) {
                driver.findElement(locator).click();
                System.out.println("Click Avanzado");
            }else {
                System.out.println("No se encontró "+locator);
            }

        } catch (Exception e){
            driver.findElement(locator).click();
            System.out.println("Click Basico");
        }
        }
    }

