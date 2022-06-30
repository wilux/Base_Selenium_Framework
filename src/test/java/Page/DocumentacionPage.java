package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentacionPage {
    //Pantalla Documentacion
    public By inputFecha = By.name ( "_BNQFB11UCB" ); //fecha value "dd/MM/YYYY" // Desde fecha bT actual para atras
    public By inputAnioCierre = By.id ( "_BNQFB11CCA" );
    public By Grilla_Documentos = By.id ( "GRIDARCHIVOS" );
    public By PrimerFila = By.id ( "span__DESCRIPCION_00" );//+ 01 to 10
    public By BTNOPAGREGAR = By.id ( "BTNOPAGREGARLD" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    WebDriver driver;

    public DocumentacionPage(WebDriver driver) {

        this.driver = driver;

    }


}


