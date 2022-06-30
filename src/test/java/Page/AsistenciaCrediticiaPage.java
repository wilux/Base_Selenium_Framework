package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AsistenciaCrediticiaPage {
    //Datos de la actividad
    public By InputAnosExperiencia = By.id ( "_BNQFB11ERU" );//1
    public By InputCantidadEmp = By.id ( "_BNQFB11CEM" );//1
    //Datos Patrimoniales
    public By InputActivoTotal = By.id ( "_BNQFB11ACT" );// 200.000
    public By InputPasivoTotal = By.id ( "_BNQFB11PAT" );// 100.000
    public By InputPatrimonioNeto = By.id ( "_BNQFB11PNT" );//100.000
    public By InputResultadoAntesGcias = By.id ( "_BNQFB11RPG" );// 100.000
    public By InputVtasAnuales = By.id ( "_VTASANUALES" ); //100.000
    public By InputActivoCorriente = By.id ( "_BNQFB11ACO" ); //100.000
    public By InputPasivoCorriente = By.id ( "_BNQFB11PAC" ); //100.000
    public By InputResultadoEjerc = By.id ( "_BNQFB11REJ" );//100.000
    //Datos comerciales
    public By InputAntiguedadEmpresa = By.id ( "_BNQFB11ANT" );// 1
    public By InputVtasActual = By.id ( "_BNQFB11VPP" );// 100.000  //2021
    public By InputVtasAnterior1 = By.id ( "_BNQFB11VA1" );// 100.000  //2020
    public By InputVtasAnterior2 = By.id ( "_BNQFB11VA2" );// 100.000  //2019
    //Solicitud Asistencia
    public By SelectModulo = By.id ( "_MODLINESP_P" );// 303
    public By SelectLinea = By.id ( "TIPOPLINESP" );// 20
    public By InputMonto = By.id ( "_BNQFB15MTO" );// 100000
    public By BTNOPAGREGAR = By.id ( "BTNOPAGREGAR" );
    //Botonera inferior
    public By BTN_CalcularAsistencia = By.id ( "BTNOPCALCULOASISTENCIA" );
    public By BTN_PerfilRiesgo = By.id ( "BTNOPPERFILDERIESGO" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    //Botones Si/NO
    public By BTN_SI = By.id ( "BTNCONFIRMATION" );
    public By BTN_NO = By.id ( "BTNCANCELCONFIRMATION" );
    WebDriver driver;

    public AsistenciaCrediticiaPage(WebDriver driver) {

        this.driver = driver;

    }


}


