package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimulacionProductosPage {
    //Mensajes
    public By MsgTextArriba = By.className ( "MsgText" );
    public By MsgTextMedio = By.className ( "HTMLTXTTEXT1" );
    public By MsgTextAbajo = By.className ( "HTMLTXTTEXT5" );
    public By SelectPaquete = By.name ( "_JBNYC5PQTE" );
    public By SelectLineaPrestamo = By.name ( "_LINEA" );
    public By InputMonto = By.name ( "_BNQFPC5MTO" );
    public By InputPlazo = By.name ( "_BNQFPC5PZO" );
    public By SelectDestinoFondos = By.name ( "_BNQFPC5DES" );
    public By BTNOPSIMULAR = By.id ( "BTNOPSIMULAR" );
    public By BTNOPDESCARTAR = By.id ( "BTNOPDESCARTAR" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTN_SI = By.id ( "BTNCONFIRMATION" );
    public By BTN_NO = By.id ( "BTNCANCELCONFIRMATION" );
    // public By BTNCONFIRMATION = By.id("BTNCONFIRMATION");
    public By ValorCuotaAprox = By.name ( "_BNQFPC5CUO" );
    public By ValorTna = By.name ( "_BNQFPC5TNA" );
    public By ValorTem = By.name ( "_BNQFPC5TEM" );
    public By ValorTea = By.name ( "_BNQFPC5TEA" );
    public By CheckCalificacion = By.name ( "_BNQFPC5CBE" );
    public By CheckPrestamo = By.name ( "_BNQFPC5PP" );
    public By CheckTarjeta = By.name ( "_BNQFPC5TC" );
    public By CheckCtaCte = By.name ( "_CTACTE" );
    public By CheckCaDolar = By.name ( "_CA_DOLARES" );
    public By CheckTC1 = By.name ( "_TCSEL_0001" );
    public By CheckTC2 = By.name ( "_TCSEL_0002" );
    public By BTNOPPAQUETIZAR = By.id ( "BTNOPPAQUETIZAR" );
    public By SelectCircuito = By.name ( "_CICUITOS_CALIF_E" );
    public By BTNOPADHESION_SERVICIOS = By.name ( "BTNOPADHESION_SERVICIOS" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    //Categoria Acuerdo BI
    public By tablaAcuerdo = By.id ( "TBL118" );
    public By spanTituloAcc = By.id ( "HTMLTXTTITLE395" );
    public By checkActualizarAcc = By.id ( "_ACTUALIZAACC" );
    public By inputMontoActualAcc = By.id ( "span__JBNYC5ACIM" );
    public By inputMontoNuevoAcc = By.id ( "_JBNYC5ACIM_NUEVO" );
    WebDriver driver;

    public SimulacionProductosPage(WebDriver driver) {

        this.driver = driver;

    }


}


