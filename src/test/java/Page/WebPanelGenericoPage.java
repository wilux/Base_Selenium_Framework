package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class WebPanelGenericoPage
{
    WebDriver driver;

    //Localizadores
    //HTMLTXTTITLE1
    // By Titulo = By.CssSelector(".MainTitle");
     By Titulo = By.id("HTMLTXTTITLE1");
     By Titulo2 = By.xpath("//span[@class='MainTitle']");
     By Mensaje = By.cssSelector(".MsgText");
    // By Wait = By.XPath("//img[@src='http://btwebqa.ar.bpn/BTWeb/images/wait.gif']");
     By Cargando = By.id("waitMessage");

    public WebPanelGenericoPage(WebDriver driver){

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


