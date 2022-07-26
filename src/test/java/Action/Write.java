package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Write {
    WebDriver driver;


    public Write(WebDriver driver) {

        this.driver = driver;

    }

    public void On(By locator, String text) {


        if ( driver.findElement ( locator ).isDisplayed() ) {
            try {

                driver.findElement ( locator ).clear ();
                driver.findElement ( locator ).sendKeys ( text );
                Thread.sleep ( 200 );


            } catch (Exception e) {
            }
        }
    }

    public void Js(By locator, String text) {



        WebElement i = driver.findElement ( locator );
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript ( "arguments[0].value='" + text + "';", i );

    }

    public void Clear(By locator) {

        if ( driver.findElement ( locator ).isDisplayed() ) {
            try {
                driver.findElement ( locator ).clear ();

            } catch (Exception e) {

            }
        }
    }

}


