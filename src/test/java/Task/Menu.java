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

    public void Ejecutar() {


        try {

            driver.findElement ( Accesos ).click ();
            System.out.println ( "Menu Acceso" );
            Thread.sleep ( 200 );
            driver.findElement ( MenuEjecutar ).click ();
            System.out.println ( "Menu Ejecutar" );


        } catch (Exception e) {
            System.out.println ( "No se encontro elemento Ejecutar" + e.getMessage () );

        }


    }

    public void WorkFlow() {


        try {

            driver.findElement ( WF ).click ();
            System.out.println ( "Menu WorkFlow" );
            Thread.sleep ( 200 );

        } catch (Exception e) {
            System.out.println ( "No se encontro elemento Ejecutar" + e.getMessage () );

        }


    }

    public void BandejaTareas() {


        try {

            driver.findElement ( Inicio ).click ();
            System.out.println ( "Menu Inicio" );
            Thread.sleep ( 200 );
            driver.findElement ( WF ).click ();
            System.out.println ( "Sub menu WorkFlow" );
            Thread.sleep ( 200 );
            driver.findElement ( BandejaTareas ).click ();
            System.out.println ( "Sub Menu Bandeja Tareas" );


        } catch (Exception e) {
            System.out.println ( "No se encontro elemento Ejecutar" + e.getMessage () );

        }


    }
}
