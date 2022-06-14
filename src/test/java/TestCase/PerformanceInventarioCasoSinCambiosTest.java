package TestCase;


import Page.EjecutarPage;
import Page.InventariodeCasosPage;
import Page.LoginPage;
import Page.MenuPage;
import Tools.Frame;
import com.google.common.base.Stopwatch;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class PerformanceInventarioCasoSinCambiosTest extends BaseTest{

    @Test
    //Login
    public void SinCambios() throws InterruptedException {

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
        ejecutar.Programa("hbnqgc30_produccion");

        //Pruebas en Inventario

        //Fechas
        frame.BuscarFrame(inventarioCasos.inputFechaDesde);
        driver.findElement(inventarioCasos.inputFechaDesde).click();
        driver.findElement(inventarioCasos.inputFechaDesde).sendKeys("01/01/2021");

        // Crea e inicia un nuevo cronómetro
        Stopwatch stopwatch;
        long timeElapsed;

        //Prueba 1 - Caso No existente
        frame.BuscarFrame(inventarioCasos.inputNroCaso);
        driver.findElement(inventarioCasos.inputNroCaso).sendKeys("999999");
        stopwatch = Stopwatch.createStarted();
        /* … El código que se está midiendo comienza … */
        driver.findElement(inventarioCasos.botonFiltrar).click();
        stopwatch.stop();    // end
        System.out.println("Caso 1 - Prueba de Caso inexistente: " + stopwatch.elapsed(TimeUnit.MILLISECONDS)+" segundos.");


        //Prueba 2 - Caso existente
        frame.BuscarFrame(inventarioCasos.inputNroCaso);
        driver.findElement(inventarioCasos.inputNroCaso).sendKeys("55054");

        stopwatch = Stopwatch.createStarted();
        /* … El código que se está midiendo comienza … */
        driver.findElement(inventarioCasos.botonFiltrar).click();
        stopwatch.stop();    // end
        System.out.println("Caso 2 - Prueba de Caso existente: " + stopwatch.elapsed(TimeUnit.MILLISECONDS)+" segundos.");


        //Prueba 3 - Cuenta
        frame.BuscarFrame(inventarioCasos.inputCuenta);
        driver.findElement(inventarioCasos.inputCuenta).sendKeys("670455");
        stopwatch = Stopwatch.createStarted();
        /* … El código que se está midiendo comienza … */
        driver.findElement(inventarioCasos.botonFiltrar).click();
        stopwatch.stop();    // end
        System.out.println("Caso 3 - Prueba de cuenta: " + stopwatch.elapsed(TimeUnit.MILLISECONDS)+" segundos.");

        //Prueba 4 - Instancia
        frame.BuscarFrame(inventarioCasos.inputNroInstancia);
        driver.findElement(inventarioCasos.inputNroInstancia).sendKeys("2912607");
        stopwatch = Stopwatch.createStarted();
        /* … El código que se está midiendo comienza … */
        driver.findElement(inventarioCasos.botonFiltrar).click();
        stopwatch.stop();    // end
        System.out.println("Caso 4 - Prueba de instancia: " + stopwatch.elapsed(TimeUnit.MILLISECONDS)+" segundos.");

        //Prueba 5 - Cuil
        frame.BuscarFrame(inventarioCasos.inputCuilDNI);
        driver.findElement(inventarioCasos.inputCuilDNI).sendKeys("27395237840");
        stopwatch = Stopwatch.createStarted();
        /* … El código que se está midiendo comienza … */
        driver.findElement(inventarioCasos.botonFiltrar).click();
        stopwatch.stop();    // end
        System.out.println("Caso 5 - Prueba de Cuil: " + stopwatch.elapsed(TimeUnit.MILLISECONDS)+" segundos.");

        }
    }
