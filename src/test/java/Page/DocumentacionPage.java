package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class DocumentacionPage
{
    WebDriver driver;

    //Pantalla Documentacion
     By inputFecha = By.name("_BNQFB11UCB"); //fecha value "dd/MM/YYYY" // Desde fecha bT actual para atras
     By inputAnioCierre = By.id("_BNQFB11CCA");
     By Grilla_Documentos= By.id("GRIDARCHIVOS");
     By PrimerFila = By.id("span__DESCRIPCION_00");//+ 01 to 10
     By BTNOPAGREGAR = By.id("BTNOPAGREGARLD");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");

    public DocumentacionPage(WebDriver driver){

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


