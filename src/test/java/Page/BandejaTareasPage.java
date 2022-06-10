package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class BandejaTareasPage
{
    WebDriver driver;

     By Grilla_Tareas = By.id("GRIDINBOX");
     By PrimerTarea = By.id("span__IDINSTANCIA_0001");
     By SegundaTarea = By.id("span__IDINSTANCIA_0002");
     By PrimerAsunto = By.id("span__ASUNTO_0001");
     By spanComentarioFila = By.id("span__COMENTARIOS_0001");
     By spanTareaFila = By.id("span__TAREA_0001");
     By BTNOPOSIGUIENTE = By.id("BTNOPOSIGUIENTE");
     By BTNCONFIRMATION = By.id("BTNCONFIRMATION");
     By BTNOPOEJECUTAR = By.id("BTNOPOEJECUTAR");
     By BTNOPDESCARTAR = By.id("BTNOPDESCARTAR");
     By BTNOPOINICIAR = By.id("BTNOPOINICIAR");
     By BTNOPOTOMAR = By.id("BTNOPOTOMAR");
     By InputBuscarAsunto = By.id("_BASU");

    public BandejaTareasPage(WebDriver driver){

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


