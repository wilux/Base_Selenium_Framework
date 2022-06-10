package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class EntrevistaPage
{
    WebDriver driver;

    //Tramite
     By campoTramite = By.id("span__BNQFPA2NRO");
     By inputTramite = By.id("_BNQFPA2NRO");

    //Datos personales
     By inputApellido = By.id("_BNQFPA2APE");
     By inputNombre = By.id("_BNQFPA2NOM");
     By inputFechaNac = By.id("_BNQFPA2FNA");
     By inputFechaIngresoPais = By.id("_SNGC11DAT2");
     By SelectCapacidadLegal = By.name("_PFCAPL");
     By SelectEstadoCivil = By.name("_BNQFPA2ECI");
     By SelectSexo = By.name("_BNQFPA2SEX");
     By SelectNacionalidad = By.name("_PFPNAC");
     By SelectPaisCiudadania = By.name("_PAIS");
     By SelectProvincia = By.name("_SNGC11DPTO");
     By inputLocalidad = By.name("_SNGC11PROV");//326 Neuquen
     By SelectOcupacion = By.name("_SNGC60OCUP");
     By BTNOPDOMICILIOREAL = By.id("BTNOPDOMICILIOREAL");
     By CampoDomicilio = By.id("span__BNQFPA2DOM");
     By InputDomicilio = By.id("_BNQFPA2DOM");
     By SelectTipo = By.name("_BNQFPA2TDO");
     By InputDocumento = By.id("_BNQFPA2NDO");
     By BTNOPVALIDAR = By.id("BTNOPVALIDAR");
     By InputMail = By.name("_BNQFPA2MAI");
     By NoMail = By.name("_NOTIENEEMAIL");
     By SelectTelefono = By.name("_BNQFPA2TT1");
     By SelectTelefono2 = By.name("_BNQFPA2TT2");
     By SelectCodigoArea = By.name("_CODIGODEAERAT1");
     By SelectCodigoArea2 = By.name("_CODIGODEAERAT2");
     By InputTelefono = By.name("_BNQFPA2TE1");
     By InputTelefono2 = By.name("_BNQFPA2TE2");
     By GridCtaCredito = By.id("GRIDACRED");
     By selectModalidad = By.name("_MODALIDAD");

     By BTNOPCAMBIARCTA = By.id("BTNOPCAMBIARCTA");
     By BTNOPELEGIRCTA = By.id("BTNOPELEGIRCTA");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTN_SI = By.id("BTNCONFIRMATION");
     By BTN_NO = By.id("BTNCANCELCONFIRMATION");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");

    //Datos del Negocio 
     By InputFechaNegocio = By.name("_SNGC60FINI");
     By inputActividad = By.name("_ACTCOD1");
     By InputNombreEmpresa = By.name("_SNGC60RZSO");
     By SelectSegmento = By.name("_PJSEGMENTO");


    // Datos de la Empresa PJ
     By InputRazonSocial = By.name("_PJRAZS");
     By InputNombreFantasial = By.name("_SNGC11AUX");
     By SelectNaturalezaJuridica = By.name("_NJCOD");
     By InputFechaConstitucion = By.name("_PJFCON");
     By InputNroRegistro = By.name("_SNGC70VAL");

    //Modelo de Riesgo
     By TexareaObsvaciones = By.name("_BNQFPA2OBS");


    //MsgText
     By MsgText = By.className("MsgText");

    //Cuenta Credito
     By tabla_HTMLTBLCAT245 = By.id("HTMLTBLCAT245");
     By GRIDACRED = By.id("GRIDACRED");
     By td = By.tagName("td");
     By CampoAcreditaBPN = By.id("span__ACREDITAENBPN_0001");
     By PrimerFila = By.id("span__BNQFPA4CTA_0001");
    //span__BNQFPA4CTA_0001
    //input hidden _ACREDITAENBPN_0001 SI o NO 
    //span__ACREDITAENBPN_0001
    //_BNQFPA4EST_0001

    //_BNQFPA2CTA
     By SelectCuentaBT = By.name("_BNQFPA2CTA");
     By SelectSectorEmpleador = By.name("_BNQFPA2ORD");
     By InputIngresosDepedencia = By.name("_BNQFPA2IRD");
     By InputIngresosIndependiente = By.name("_BNQFPA2IIN");


     By TipoPersona = By.id("_PETIPO");

    public EntrevistaPage(WebDriver driver){

        this.driver = driver;

    }


    public void Programa(String strProgram){

//
//        WebElement iframe = driver.findElement(By.id("0"));
//        driver.switchTo().frame(iframe);
//        driver.switchTo().frame("step1");
//        driver.findElement(_PROGRAMA).sendKeys(strProgram);
//        driver.findElement(BTNOPCONFIRMAR).click();

    }



}


