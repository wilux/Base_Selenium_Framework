package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NuevaInstanciaPage {
    //hxwf901 - Iniciar Instancia de Proceso
    public By Grilla_Instancia = By.id ( "GRIDPROCESOSYTAREAS" );
    public By Entrevista_identificacion = By.id ( "span__DSCTAREA_0002" );
    public By CierreCuentaVista = By.id ( "span__DSCTAREA_0003" );
    // By CierreCuentaVista = By.XPath("//span[contains(@class, 'ReadonlyAttributeBase') and text() = 'Cierre de Cuenta Vista']");
    public By BTNOPOINICIAR = By.id ( "BTNOPOINICIAR" );
    WebDriver driver;

    public NuevaInstanciaPage(WebDriver driver) {

        this.driver = driver;

    }


}


