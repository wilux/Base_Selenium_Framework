package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Choose {
    WebDriver driver;


    public Choose(WebDriver driver) {

        this.driver = driver;

    }

    public void byText(By locator, String text) throws InterruptedException {

        driver.findElement(locator).click();
        Thread.sleep(200);
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
        Thread.sleep(200);

    }

}

