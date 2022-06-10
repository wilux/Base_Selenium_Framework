package UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class EjecutarPage
{
    WebDriver driver;

    By _PROGRAMA = By.id("_PROGRAMA");
    By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");

    public EjecutarPage(WebDriver driver){

        this.driver = driver;

    }


    public void Programa(String strProgram){


        WebElement iframe = driver.findElement(By.id("0"));
        driver.switchTo().frame(iframe);
        driver.switchTo().frame("step1");
        driver.findElement(_PROGRAMA).sendKeys(strProgram);
        driver.findElement(BTNOPCONFIRMAR).click();

    }



}


