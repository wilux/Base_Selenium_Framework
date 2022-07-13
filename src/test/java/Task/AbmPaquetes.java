package Task;

import Config.Acciones;
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
        Acciones acciones = new Acciones ( driver );
        acciones.menu ().Ejecutar ();
        acciones.ejecutar ().Programa ( "HBNQFCB2" );
    }


    public void Filtrar(String codigoPaquete) {
        System.out.println ( "Filtrando" );
        Acciones acciones = new Acciones ( driver );
        acciones.write ().On ( input_JBNYC5PQTE_FILTRO, codigoPaquete );
        acciones.click ().On ( BTNFILTER_GRDPAQUETES );
    }

    public void SeleccionarFila() {
        System.out.println ( "Seleccionado Fila" );
        Acciones acciones = new Acciones ( driver );
        acciones.grid ().rowSelectbyFila ( GRIDGRDPAQUETES, fila_JBNYC5DESC_0001 );
    }


    public void Alta() {
        Acciones acciones = new Acciones ( driver );
        acciones.click ().On ( BTNOPALTA_PAQUETE );
    }

    public void Baja() {
        Acciones acciones = new Acciones ( driver );
        acciones.click ().On ( BTNOPBAJA_PAQUETE );
    }

    public void Edicion() {
        Acciones acciones = new Acciones ( driver );
        acciones.click ().On ( BTNOPMODIFICA_PAQUETE );
    }

    public void NuevaVersion() {
        Acciones acciones = new Acciones ( driver );
        acciones.click ().On ( BTNOPCLONA_PAQUETE );
    }

    public void Detalle() {
        Acciones acciones = new Acciones ( driver );
        acciones.click ().On ( BTNOPDETALLE_PAQUETE );
    }

    public void Estado(String value) {
        System.out.println ( "Estado del Paquete" );
        Acciones acciones = new Acciones ( driver );
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
        acciones.radio ().On ( radio_JBNYC5ESTA_FILTRO, index );
    }
}
