package Page;


import Config.Accion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbmPaquetesPage {
    //Localizadores


    public By input_JBNYC5PQTE_FILTRO = By.id ( "_JBNYC5PQTE_FILTRO" );
    public By radio_JBNYC5ESTA_FILTRO = By.name ( "_JBNYC5ESTA_FILTRO" ); // values P A R B
    public By GRIDGRDPAQUETES = By.id ( "GRIDGRDPAQUETES" );
    public By fila_JBNYC5DESC_0001 = By.id ( "span__JBNYC5DESC_0001" );


    public By BTNOPALTA_PAQUETE = By.id ( "BTNOPALTA_PAQUETE" );
    public By BTNOPBAJA_PAQUETE = By.id ( "BTNOPALTA_PAQUETE" );
    public By BTNOPMODIFICA_PAQUETE = By.id ( "BTNOPMODIFICA_PAQUETE" );
    public By BTNOPCLONA_PAQUETE = By.id ( "BTNOPCLONA_PAQUETE" );
    public By BTNOPDETALLE_PAQUETE = By.id ( "BTNOPDETALLE_PAQUETE" );
    public By BTNFILTER_GRDPAQUETES = By.id ( "BTNFILTER_GRDPAQUETES" );


    WebDriver driver;

    public AbmPaquetesPage(WebDriver driver) {

        this.driver = driver;
        Accion accion = new Accion ( driver );

    }


}


