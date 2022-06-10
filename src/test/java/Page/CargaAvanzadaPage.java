package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class CargaAvanzadaPage
{
    WebDriver driver;

     By Select_NivelEduc = By.id("_COMBONIVELEDUC");
     By inputApellidoPadre = By.id("_APEPADRE");
     By inputApellidoMadre = By.id("_APEMADRE");
     By inputNombrePadre = By.id("_NOMPADRE");
     By inputNombreMadre = By.id("_NOMMADRE");
     By BTNOPDOMICILIOREAL = By.id("BTNOPDOMICILIOREAL");
     By BTNOPBUSCARWC = By.id("BTNOPBUSCARWC");
     By inputOrigenFondos = By.id("_ORIGENFONDOS");
     By BTNOPACEPTAR = By.id("BTNOPACEPTAR");
     By BTNOPBTNCONFIRMAR = By.id("BTNOPBTNCONFIRMAR");
     By BTNOPBTNFINALIZAR = By.id("BTNOPBTNFINALIZAR");
     By BTN_SI = By.id("BTNCONFIRMATION");
     By BTN_NO = By.id("BTNCANCELCONFIRMATION");
     By BTNOPCONYUGE = By.id("BTNOPCONYUGE");
     By BTNOPMODIFICARDATOS = By.id("BTNOPMODIFICARDATOS");
     By Select_EstadoCivil = By.id("_COMBOESTCIV"); //value 4 soltero
    //_COMBOESTCIV

    public CargaAvanzadaPage(WebDriver driver){

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


