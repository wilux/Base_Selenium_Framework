package Task;

import Config.Acciones;
import Page.EjecutarPage;
import Page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ejecutar {
    WebDriver driver;


    public Ejecutar(WebDriver driver) {

        this.driver = driver;
    }

    public void Programa(String strProgram) {

        EjecutarPage ejecutarPage = new EjecutarPage ( driver );
        Acciones acciones = new Acciones ( driver );

//        WebElement iframe = driver.findElement ( By.id ( "0" ) );
//        driver.switchTo ().frame ( iframe );
//        driver.switchTo ().frame ( "step1" );
//        driver.findElement ( ejecutarPage._PROGRAMA ).sendKeys ( strProgram );
//        driver.findElement ( ejecutarPage.BTNOPCONFIRMAR ).click ();

        acciones.write ().On ( ejecutarPage._PROGRAMA, strProgram );
        acciones.click ().On ( ejecutarPage.BTNOPCONFIRMAR );

    }

}
