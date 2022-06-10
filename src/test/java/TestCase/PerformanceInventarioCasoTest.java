package TestCase;


import Page.EjecutarPage;
import Page.InventariodeCasosPage;
import Page.LoginPage;
import Page.MenuPage;
import Tools.Frame;
import org.junit.jupiter.api.Test;

public class PerformanceInventarioCasoTest extends BaseTest{

    @Test
    //Login
    public void ConCambios() throws InterruptedException {

        //Instancio Objectos
        LoginPage login = new LoginPage(driver);
        MenuPage menu = new MenuPage(driver);
        EjecutarPage ejecutar = new EjecutarPage(driver);
        InventariodeCasosPage inventarioCasos = new InventariodeCasosPage(driver);
        Frame frame = new Frame(driver);

        //Hago el Login
        login.Ingresar();

        //Menu Ejecutar
        menu.Ejecutar();

        //Ejecuto un programa
        ejecutar.Programa("hbnqgc30");

        //Pruebas en Inventario

        //Prueba 1 - Cuena
        frame.BuscarFrame(inventarioCasos.inputNroCaso);
        driver.findElement(inventarioCasos.inputNroCaso).sendKeys("644710");
        driver.findElement(inventarioCasos.botonFiltrar).click();

        }
    }
