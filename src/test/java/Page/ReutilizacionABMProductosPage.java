package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class ReutilizacionABMProductosPage
{
    WebDriver driver;

     By GRID_TarjetasDebito = By.id("GRIDGRDTD");
     By PrimerTarjeta = By.id("span__DESCTD_0001");
     By BTNOPACEPTARTDNUEVA = By.id("BTNOPACEPTARTDNUEVA");
     By BTNOPACEPTARTExistente = By.id("BTNOPACEPTARTDEXISTENTE");
     By BTNOPPERFILDERIESGO = By.id("BTNOPPERFILDERIESGO");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");
     By SelectSeguroVida = By.name("_BNQFPC5SCC");

    public ReutilizacionABMProductosPage(WebDriver driver){

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


