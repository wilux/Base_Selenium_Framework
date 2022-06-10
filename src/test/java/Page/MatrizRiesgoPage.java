package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class MatrizRiesgoPage
{
    WebDriver driver;


     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");

     By Radio_Si = By.name("_ACTUALIZALEGAJOMR");//value S o N

    public MatrizRiesgoPage(WebDriver driver){

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


