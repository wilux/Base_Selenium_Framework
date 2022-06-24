package Action;

import Tools.Frame;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Get {
    WebDriver driver;


    public Get(WebDriver driver) {

        this.driver = driver;

    }

    public String ValueOnInput(By locator) {
        String value = "";
        Frame frame = new Frame ( driver );

        try {
            if ( frame.BuscarFrame ( locator ) ) {
                value = driver.findElement ( locator ).getAttribute ( "value" );
                System.out.println ( "Valor Actual de " + locator + "=" + value + " length: " + value.length () );
            }
            else {
                value = "";
                System.out.println ( "No se encontró " + locator );
            }

        } catch (Exception e) {

        }

        return value;
    }

    public String TextOnTag(By locator) {
        String value = "";
        Frame frame = new Frame ( driver );

        if ( frame.BuscarFrame ( locator ) ) {
            value = driver.findElement ( locator ).getText ();
            System.out.println ( "Value de " + locator + "=" + value + " length: " + value.length () );
        }
        else {
            System.out.println ( "No se encontró " + locator );
        }
        return value;
    }

    public String ValueJS(By locator, String id) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String value = "";
        Frame frame = new Frame ( driver );

        if ( frame.BuscarFrame ( locator ) ) {
            value = (String) js.executeScript ( "return document.getElementById('" + id + "').innerHTML" );
            System.out.println ( "Value de " + locator + "=" + value + " length: " + value.length () );
        }
        else {
            System.out.println ( "No se encontró " + locator );
        }
        return value;
    }
}


