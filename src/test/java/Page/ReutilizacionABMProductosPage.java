package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReutilizacionABMProductosPage {
    public By GRID_TarjetasDebito = By.id ( "GRIDGRDTD" );
    public By PrimerTarjeta = By.id ( "span__DESCTD_0001" );
    public By BTNOPACEPTARTDNUEVA = By.id ( "BTNOPACEPTARTDNUEVA" );
    public By BTNOPACEPTARTExistente = By.id ( "BTNOPACEPTARTDEXISTENTE" );
    public By BTNOPPERFILDERIESGO = By.id ( "BTNOPPERFILDERIESGO" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    public By SelectSeguroVida = By.name ( "_BNQFPC5SCC" );
    WebDriver driver;

    public ReutilizacionABMProductosPage(WebDriver driver) {

        this.driver = driver;

    }


}


