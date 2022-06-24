package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetalleDireccionPage {
    public By InputFechaDesde = By.id ( "_SNGC13RDES" );
    public By SelectCalle = By.name ( "_SNGC01ID" );
    public By InputCalle = By.id ( "_NOM1" );
    public By InputNumero = By.id ( "_NOM2" );
    public By SelectNumero = By.name ( "_SNGC02ID" );
    public By SelectPais = By.name ( "_PAISDOM" );
    public By SelectProvincia = By.name ( "_DODEPCODP" );
    public By SelectLocalidad = By.name ( "_XLOCCOD" );
    public By InputCodigoPostal = By.id ( "_CODPOS" );
    public By BTNOPBTNCONFIRMAR = By.id ( "BTNOPBTNCONFIRMAR" );
    public By BTNCONFIRMATION = By.id ( "BTNCONFIRMATION" );
    public By BTNOPBTNFINALIZAR = By.id ( "BTNOPBTNFINALIZAR" );
    WebDriver driver;

    public DetalleDireccionPage(WebDriver driver) {

        this.driver = driver;

    }


    public void Programa(String strProgram) {

//
//        WebElement iframe = driver.findElement(By.id("0"));
//        driver.switchTo().frame(iframe);
//        driver.switchTo().frame("step1");
//        driver.findElement(_PROGRAMA).sendKeys(strProgram);
//        driver.findElement(BTNOPCONFIRMAR).click();

    }


}


