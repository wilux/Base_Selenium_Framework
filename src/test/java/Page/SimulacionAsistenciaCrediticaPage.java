package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class SimulacionAsistenciaCrediticaPage
{
    WebDriver driver;

    By InputVtasAnuales = By.id("_VTASANUALES"); //10000
    By InputPatrimonioNeto = By.id("_BNQFB11PNT");//10000
    By InputResultadoEjerc = By.id("_BNQFB11REJ");//10000
    By InputAnosExperiencia = By.id("_BNQFB11ERU");//1
    By InputCantidadEmp = By.id("_BNQFB11CEM");//1
    By BTNOPSIMULACION = By.id("BTNOPSIMULACION");
    By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
    By BTNOPCERRAR = By.id("BTNOPCERRAR");
    By BTN_SI = By.id("BTNCONFIRMATION");
    By BTN_NO = By.id("BTNCANCELCONFIRMATION");

    public SimulacionAsistenciaCrediticaPage(WebDriver driver){

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


