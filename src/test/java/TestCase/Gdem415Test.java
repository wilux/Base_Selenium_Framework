package TestCase;

import Page.*;
import Tools.Frame;
import Tools.Grid;
import Tools.SQLDatabaseConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class Gdem415Test extends BaseTest{


    @Test
    //Tests google calculator
    public void CierreNoContractual() throws InterruptedException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection();
        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario("SERPILLOE");

        //Login
        LoginPage login = new LoginPage(driver);
        login.Ingresar();

        Grid grid = new Grid(driver);
        MenuPage menu = new MenuPage(driver);
        EjecutarPage ejecutar = new EjecutarPage(driver);
        BandejaTareasPage bandejaTareasPage = new BandejaTareasPage(driver);
        CierredeCuentasVistasPage cierreCuentas = new CierredeCuentasVistasPage(driver);
        Frame frame = new Frame(driver);

        //Ejecutar
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
        //Click Supervision
        frame.BuscarFrame(cierreCuentas.btnSupervision);
        driver.findElement(cierreCuentas.btnSupervision).click();
        //Cambiar usuario a Supervisor
        bd.CambiarUsuario("ROSSIF");

        //Cerramos Sesion
        menu.Logout();

        //Ingreso con nuevo Usuario
        login.Ingresar();
        //BandejaTareas
        menu.Ejecutar();
        ejecutar.Programa("hxwf900");
        //Retomo tarea
        frame.BuscarFrame(bandejaTareasPage.Grilla_Tareas);
        grid.rowSelectbyFila(bandejaTareasPage.Grilla_Tareas, bandejaTareasPage.PrimerTarea);
        driver.findElement(bandejaTareasPage.BTNOPOTOMAR).click();
        grid.rowSelectbyFila(bandejaTareasPage.Grilla_Tareas, bandejaTareasPage.PrimerTarea);
        driver.findElement(bandejaTareasPage.BTNOPOEJECUTAR).click();
        }
    }
