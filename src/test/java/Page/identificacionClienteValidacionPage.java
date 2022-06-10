package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class identificacionClienteValidacionPage
{
    WebDriver driver;


    // Value S o N
     By RCheckGrupo = By.id("_BNQFB11PGE");
     By RCheckSociedad = By.id("_BNQFB11SHE");

    //MsgText  //Pendiente de confirmación de la Gcia. de Créditos
     By MsgText = By.className("MsgText");
     By Estado = By.id("_BNQFB11EST");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");
     By BTN_SI = By.id("BTNCONFIRMATION");
     By BTN_NO = By.id("BTNCANCELCONFIRMATION");

    public identificacionClienteValidacionPage(WebDriver driver){

        this.driver = driver;

    }


    public void Programa(String strProgram){


//        WebElement iframe = driver.findElement(By.id("0"));
//        driver.switchTo().frame(iframe);
//        driver.switchTo().frame("step1");
//        driver.findElement(_PROGRAMA).sendKeys(strProgram);
//        driver.findElement(BTNOPCONFIRMAR).click();

    }



}


