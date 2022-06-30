package Task;

import Page.EjecutarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ejecutar extends EjecutarPage {
    WebDriver driver;


    public Ejecutar(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }

    public void Programa(String strProgram) {


        WebElement iframe = driver.findElement ( By.id ( "0" ) );
        driver.switchTo ().frame ( iframe );
        driver.switchTo ().frame ( "step1" );
        driver.findElement ( _PROGRAMA ).sendKeys ( strProgram );
        driver.findElement ( BTNOPCONFIRMAR ).click ();

    }

}
