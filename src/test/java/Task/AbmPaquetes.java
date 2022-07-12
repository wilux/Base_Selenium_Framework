package Task;

import Config.Accion;
import Page.AbmPaquetesPage;
import org.openqa.selenium.WebDriver;

public class AbmPaquetes extends AbmPaquetesPage {
    WebDriver driver;


    public AbmPaquetes(WebDriver driver) {
        super ( driver );
        this.driver = driver;

    }

    public void Iniciar() {
        System.out.println ( "Iniciando ABM Paquetes" );
        Accion accion = new Accion ( driver );
        accion.menu ().Ejecutar ();
        accion.ejecutar ().Programa ( "HBNQFCB2" );
    }


    public void Filtrar(String codigoPaquete) {
        System.out.println ( "Filtrando" );
        Accion accion = new Accion ( driver );
        accion.write ().On ( input_JBNYC5PQTE_FILTRO, codigoPaquete );
        accion.click ().On ( BTNFILTER_GRDPAQUETES );
    }

    public void SeleccionarFila() {
        System.out.println ( "Seleccionado Fila" );
        Accion accion = new Accion ( driver );
        accion.grid ().rowSelectbyFila ( GRIDGRDPAQUETES, fila_JBNYC5DESC_0001 );
    }


    public void Alta() {
        Accion accion = new Accion ( driver );
        accion.click ().On ( BTNOPALTA_PAQUETE );
    }

    public void Baja() {
        Accion accion = new Accion ( driver );
        accion.click ().On ( BTNOPBAJA_PAQUETE );
    }

    public void Edicion() {
        Accion accion = new Accion ( driver );
        accion.click ().On ( BTNOPMODIFICA_PAQUETE );
    }

    public void NuevaVersion() {
        Accion accion = new Accion ( driver );
        accion.click ().On ( BTNOPCLONA_PAQUETE );
    }

    public void Detalle() {
        Accion accion = new Accion ( driver );
        accion.click ().On ( BTNOPDETALLE_PAQUETE );
    }

    public void Estado(String value) {
        System.out.println ( "Estado del Paquete" );
        Accion accion = new Accion ( driver );
        int index = 0;
        switch (value) {
            case "P":
                index = 0;
                break;
            case "A":
                index = 1;
                break;
            case "R":
                index = 2;
                break;
            case "B":
                index = 3;
                break;
            default:
                index = 0;
        }
        accion.radio ().On ( radio_JBNYC5ESTA_FILTRO, index );
    }
}
