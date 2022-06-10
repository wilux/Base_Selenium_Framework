package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class DetalleDireccionPage
{
    WebDriver driver;

     By InputFechaDesde = By.id("_SNGC13RDES");
     By SelectCalle = By.name("_SNGC01ID");
     By InputCalle = By.id("_NOM1");
     By InputNumero = By.id("_NOM2");
     By SelectNumero = By.name("_SNGC02ID");
     By SelectPais = By.name("_PAISDOM");
     By SelectProvincia = By.name("_DODEPCODP");
     By SelectLocalidad = By.name("_XLOCCOD");
     By InputCodigoPostal = By.id("_CODPOS");
     By BTNOPBTNCONFIRMAR = By.id("BTNOPBTNCONFIRMAR");
     By BTNCONFIRMATION = By.id("BTNCONFIRMATION");
     By BTNOPBTNFINALIZAR = By.id("BTNOPBTNFINALIZAR");

    public DetalleDireccionPage(WebDriver driver){

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


