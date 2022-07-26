package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Choose {
    WebDriver driver;


    public Choose(WebDriver driver) {

        this.driver = driver;

    }

    public void byText(By locator, String text) {


            Select select = new Select ( driver.findElement ( locator ) );
            select.selectByVisibleText ( text );


    }

    public void byValue(By locator, String value) {




                Select select = new Select ( driver.findElement ( locator ) );
                select.selectByValue ( value );




    }

}

