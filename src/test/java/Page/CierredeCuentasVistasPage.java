package Page;


import Tools.Grid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class CierredeCuentasVistasPage
{
    WebDriver driver;

    //Filtro
    //Decisión de Cierre
    public By radioDecision = By.name("_DESICION"); // C o B
    //Motivo de Cierre
    public By radioMotivo = By.name("_BNQFT33MOT"); // 1 a 4
    //Seleccione Cuenta
    public By inputCuenta = By.name("_CUENTA_CUIL");
    public By btnBuscar = By.id("BTNOPBUSCAR");

    //Cuentas Corrientes
    public By denominacionCuenta = By.id("_CUENTA_NOM_0001");
    public By gridCuentas = By.id("HTMLTBLGRID_CUENTAS");
    public By gridCuentasFila1 = By.id("span__CUENTA_0001");
    public By btnSelCuenta = By.id("BTNOPSELECCIONARCTA");

    //Datos de la Cuenta
    public By gridDatos = By.id("HTMLTBLDATOS");


    //Débitos Automáticos
    public By DebitosAutomaticosArchivos = By.id("_DEBAUTOMATICOSPRESENTADOS");
    public By PoseeDebitosAutomaticos = By.id("_POSEEDEBAUTOMATICOS");

    //Botonera
    public By btnDescartar = By.id("BTNOPDESCARTAR");
    public By btnSupervision = By.id("BTNOPSUPERVISION");
    public By btnIniciarCierre = By.id("BTNOPINICIARCIERRE");
    public By btnCerrar = By.id("BTNOPCERRAR");

    //Confirmacion
    public By btnSi = By.id("BTNCONFIRMATION");
    public By btnNo = By.id("BTNCANCELCONFIRMATION");


    public CierredeCuentasVistasPage(WebDriver driver){

        this.driver = driver;

    }


    public void DecisionDeCierre(int value){
        //value 1 o 2
        driver.findElement(radioDecision).click();
        driver.findElement(By.cssSelector("input[type='radio'][value='"+value+"']"));
    }

    public void MotivoDeCierre(int value){
        //value 1 a 4
        driver.findElement(radioMotivo).click();
        driver.findElement(By.cssSelector("input[type='radio'][value='"+value+"']"));
    }

    public void BuscarCuenta(String cuenta){
        driver.findElement(inputCuenta).sendKeys(cuenta);
        driver.findElement(btnBuscar).click();
    }

    public void SeleccionarSubCuenta(String subcuenta){
        Grid grid = new Grid(driver);
        grid.rowSelectbyText(gridCuentas, subcuenta);
        driver.findElement(btnSelCuenta).click();
    }



}


