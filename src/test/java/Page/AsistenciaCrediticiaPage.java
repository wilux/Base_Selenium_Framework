package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class AsistenciaCrediticiaPage
{
    WebDriver driver;

    //Datos de la actividad
     By InputAnosExperiencia = By.id("_BNQFB11ERU");//1
     By InputCantidadEmp = By.id("_BNQFB11CEM");//1

    //Datos Patrimoniales
     By InputActivoTotal = By.id("_BNQFB11ACT");// 200.000
     By InputPasivoTotal = By.id("_BNQFB11PAT");// 100.000
     By InputPatrimonioNeto = By.id("_BNQFB11PNT");//100.000
     By InputResultadoAntesGcias = By.id("_BNQFB11RPG");// 100.000
     By InputVtasAnuales = By.id("_VTASANUALES"); //100.000
     By InputActivoCorriente = By.id("_BNQFB11ACO"); //100.000
     By InputPasivoCorriente = By.id("_BNQFB11PAC"); //100.000
     By InputResultadoEjerc = By.id("_BNQFB11REJ");//100.000

    //Datos comerciales
     By InputAntiguedadEmpresa = By.id("_BNQFB11ANT");// 1
     By InputVtasActual = By.id("_BNQFB11VPP");// 100.000  //2021
     By InputVtasAnterior1 = By.id("_BNQFB11VA1");// 100.000  //2020
     By InputVtasAnterior2 = By.id("_BNQFB11VA2");// 100.000  //2019

    //Solicitud Asistencia
     By SelectModulo = By.id("_MODLINESP_P");// 303
     By SelectLinea = By.id("TIPOPLINESP");// 20
     By InputMonto = By.id("_BNQFB15MTO");// 100000
     By BTNOPAGREGAR = By.id("BTNOPAGREGAR");

    //Botonera inferior
     By BTN_CalcularAsistencia = By.id("BTNOPCALCULOASISTENCIA");
     By BTN_PerfilRiesgo = By.id("BTNOPPERFILDERIESGO");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");



    //Botones Si/NO
     By BTN_SI = By.id("BTNCONFIRMATION");
     By BTN_NO = By.id("BTNCANCELCONFIRMATION");

    public AsistenciaCrediticiaPage(WebDriver driver){

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


