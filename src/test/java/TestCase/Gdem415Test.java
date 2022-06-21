package TestCase;

import Page.*;
import Tools.Frame;
import Tools.Grid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class Gdem415Test extends BaseTest{


    @Test
    //Tests google calculator
    public void CierreNoContractual() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        Grid grid = new Grid(driver);
        login.Ingresar();
        MenuPage menu = new MenuPage(driver);
        EjecutarPage ejecutar = new EjecutarPage(driver);
        BandejaTareasPage bandejaTareasPage = new BandejaTareasPage(driver);
        CierredeCuentasVistasPage cierreCuentas = new CierredeCuentasVistasPage(driver);
        Frame frame = new Frame(driver);
        menu.Ejecutar();

        //BandejaTareas
        ejecutar.Programa("hxwf900");
        frame.BuscarFrame(bandejaTareasPage.BTNOPOINICIAR);
        driver.findElement(bandejaTareasPage.BTNOPOINICIAR).click();
        //Iniciar Cierre CtasCtes
        grid.rowSelectbyText(bandejaTareasPage.Proceso_Tareas, "Cierre de Cuenta Vista");
        driver.findElement(bandejaTareasPage.BTNOPOINICIAR).click();

        //Pantalla Inicial Cierres Cta Ctes
        frame.BuscarFrame(cierreCuentas.radioDecision);
        //Decisión de Cierre
        cierreCuentas.DecisionDeCierre(1);
        //Motivo de Cierre
        cierreCuentas.MotivoDeCierre(2);
        //Seleccione Cuenta - Buscar Cuenta
        cierreCuentas.BuscarCuenta("644710");
        cierreCuentas.SeleccionarSubCuenta("2");
        //
        }
    }
