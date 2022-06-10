package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class ConsultaBridgerInsightPage
{
    WebDriver driver;

     By BTNOPBUSCARBRIDGER = By.id("BTNOPBUSCARBRIDGER");
     By BTN_SinCoincidencia = By.id("BTNOPIMPRSCOINCIDENCIA");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");
     By Volver_CargaAvanzada = By.linkText("CARGA AVANZADA");

    public ConsultaBridgerInsightPage(WebDriver driver){

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


