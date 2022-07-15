package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MatrizRiesgoPage {
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    public By Radio_Si = By.name ( "_ACTUALIZALEGAJOMR" );//value S o N
    public By GRIDSUBINTEGRANTES = By.id ( "GRIDSUBINTEGRANTES" );

    WebDriver driver;

    public MatrizRiesgoPage(WebDriver driver) {

        this.driver = driver;

    }


}


