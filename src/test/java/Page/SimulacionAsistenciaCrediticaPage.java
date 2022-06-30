package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimulacionAsistenciaCrediticaPage {
    public By InputVtasAnuales = By.id ( "_VTASANUALES" ); //10000
    public By InputPatrimonioNeto = By.id ( "_BNQFB11PNT" );//10000
    public By InputResultadoEjerc = By.id ( "_BNQFB11REJ" );//10000
    public By InputAnosExperiencia = By.id ( "_BNQFB11ERU" );//1
    public By InputCantidadEmp = By.id ( "_BNQFB11CEM" );//1
    public By BTNOPSIMULACION = By.id ( "BTNOPSIMULACION" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    public By BTN_SI = By.id ( "BTNCONFIRMATION" );
    public By BTN_NO = By.id ( "BTNCANCELCONFIRMATION" );
    WebDriver driver;

    public SimulacionAsistenciaCrediticaPage(WebDriver driver) {

        this.driver = driver;

    }


}


