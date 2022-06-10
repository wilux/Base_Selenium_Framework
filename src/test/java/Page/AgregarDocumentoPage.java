package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class AgregarDocumentoPage
{
    WebDriver driver;


    By inputFecha = By.id("_FECHAVALOR");
    By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
    By BTNOPCERRAR = By.id("BTNOPCERRAR");
    By inputBuscarArchivo = By.id("htmlInputFileUpload3");

    public AgregarDocumentoPage(WebDriver driver){

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


