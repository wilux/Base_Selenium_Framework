package Task;

import Page.MenuPage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Menu extends MenuPage {
    WebDriver driver;


    public Menu(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }

    public void Logout() {
        ArrayList<String> tabs = new ArrayList<String> ( driver.getWindowHandles () );
        driver.switchTo ().window ( tabs.get ( 1 ) );

        driver.switchTo ().defaultContent ();
        driver.findElement ( Logout ).click ();

        driver.switchTo ().window ( tabs.get ( 0 ) );
    }

    public void Ejecutar() throws InterruptedException {


        try {

            driver.findElement ( Accesos ).click ();
            Thread.sleep ( 200 );
            driver.findElement ( MenuEjecutar ).click ();


        } catch (Exception e) {
            System.out.println ( "No se encontro elemento " + e.getMessage () );

        }


    }
}
