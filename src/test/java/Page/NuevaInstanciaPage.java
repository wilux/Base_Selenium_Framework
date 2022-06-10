package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class NuevaInstanciaPage
{
    WebDriver driver;


    //hxwf901 - Iniciar Instancia de Proceso
     By Grilla_Instancia = By.id("GRIDPROCESOSYTAREAS");
     By Entrevista_identificacion = By.id("span__DSCTAREA_0002");
     By CierreCuentaVista = By.id("span__DSCTAREA_0003");
    // By CierreCuentaVista = By.XPath("//span[contains(@class, 'ReadonlyAttributeBase') and text() = 'Cierre de Cuenta Vista']");
     By BTNOPOINICIAR = By.id("BTNOPOINICIAR");

    public NuevaInstanciaPage(WebDriver driver){

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


