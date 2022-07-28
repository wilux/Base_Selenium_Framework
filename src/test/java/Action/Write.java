package Action;


import org.openqa.selenium.WebDriver;
import java.awt.*;

public class Write {
    WebDriver driver;


    public Write(WebDriver driver) {

        this.driver = driver;

    }

    public void byKeys( WebDriver driver, String text) throws AWTException, InterruptedException {

        Keyboard keyboard = new Keyboard();
        keyboard.type(text);
        Thread.sleep(200);
        keyboard.enter(driver);
        Thread.sleep(200);

    }

}


