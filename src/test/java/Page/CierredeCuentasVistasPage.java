package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class CierredeCuentasVistasPage
{
    WebDriver driver;

    //Categoria Filtro
    By radioDecision = By.name("_DESICION"); // C o B
    By inputCuenta = By.name("_CUENTA_CUIL");
    By btnBuscar = By.id("BTNOPBUSCAR");
    By btnBorrar = By.id("BTNOPBORRAR");

    //Cateogira Cuentas Corrientes
    By denominacionCuenta = By.id("_CUENTA_NOM_0001");
    By gridCuentas = By.id("GRIDGRID_CUENTAS");
    By btnSelCuenta = By.id("BTNOPSELECCIONARCTA");

    //Cateogira Datos de la Cuenta
    By gridDatos = By.id("GRIDDATOS");

    //Integrantes de la Cuenta
    //By gridDatos = By.id("GRIDDATOS");

    //Débitos Automáticos
    By inputDebitosAutomaticos = By.id("_POSEEDEBAUTOMATICOS");

    //Notificación Electrónica
    By spanMail = By.id("span__EMAILDESTINO_0001");

    //Botonera
    By btnDescartar = By.id("BTNOPDESCARTAR");
    By btnNotificarEmail = By.id("BTNOPNOTIFICAREMAIL");
    By btnNotificarPostal = By.id("BTNOPNOTIFICAREPOSTAL");
    By btnIniciarCierre = By.id("BTNOPINICIARCIERRE");
    By btnCerrar = By.id("BTNOPCERRAR");

    public CierredeCuentasVistasPage(WebDriver driver){

        this.driver = driver;

    }


    public void Programa(String strProgram){

//
//        WebElement iframe = driver.findElement(By.id("0"));
//        driver.switchTo().frame(iframe);
//        driver.switchTo().frame("step1");
//        driver.findElement(_PROGRAMA).sendKeys(strProgram);
//        driver.findElement(BTNOPCONFIRMAR).click();

    }



}


