package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class RevisionProductosPage
{
    WebDriver driver;

    By TextObservaciones = By.name("_BNQFPC5OBS");
    By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
    By BTNOPRECHAZAR = By.id("BTNOPRECHAZAR");
    By BTNOPPERFILDERIESGO = By.id("BTNOPPERFILDERIESGO");
    By BTNOPLIQUIDAR = By.id("BTNOPLIQUIDAR");
    By BTN_SI = By.id("BTNCONFIRMATION");
    By BTN_NO = By.id("BTNCANCELCONFIRMATION");
    By Check_CAUSD = By.id("_CA_DOLARES");

    public RevisionProductosPage(WebDriver driver){

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


