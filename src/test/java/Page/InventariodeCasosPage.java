package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventariodeCasosPage {
    public By inputNroCaso = By.name ( "_BNQGC29NUM" );
    public By inputNroInstancia = By.name ( "_BNQGC29INS" );
    public By selectTipoCaso = By.name ( "_BNQGC29ICA" );
    public By inputCuilDNI = By.name ( "_BNQGC29NDO" );
    public By inputCuenta = By.name ( "_BNQGC29CTA" );
    public By inputApellidoNombre = By.name ( "_BNQGC29DEN" );
    public By inputDescripcion = By.name ( "_BNQGC29DEC" );
    public By inputFechaDesde = By.name ( "_BNQGC29FAL_D" );
    public By inputFechaHasta = By.name ( "_BNQGC29FAL_H" );
    public By checkBusquedaAvanzado = By.name ( "_MASFILTROS" );
    public By botonFiltrar = By.id ( "BTNFILTER_GR_CASOS" );
    WebDriver driver;


    public InventariodeCasosPage(WebDriver driver) {

        this.driver = driver;

    }


}


