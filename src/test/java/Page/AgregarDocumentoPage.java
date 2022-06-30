package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgregarDocumentoPage {
    public By inputFecha = By.id ( "_FECHAVALOR" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    public By inputBuscarArchivo = By.id ( "htmlInputFileUpload3" );
    WebDriver driver;

    public AgregarDocumentoPage(WebDriver driver) {

        this.driver = driver;

    }


}


