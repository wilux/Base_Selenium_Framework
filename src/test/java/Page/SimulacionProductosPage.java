package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class SimulacionProductosPage
{
    WebDriver driver;

    //Mensajes
     By MsgTextArriba = By.className("MsgText");
     By MsgTextMedio = By.className("HTMLTXTTEXT1");
     By MsgTextAbajo = By.className("HTMLTXTTEXT5");

     By SelectPaquete = By.name("_JBNYC5PQTE");
     By SelectLineaPrestamo = By.name("_LINEA");
     By InputMonto = By.name("_BNQFPC5MTO");
     By InputPlazo = By.name("_BNQFPC5PZO");
     By SelectDestinoFondos = By.name("_BNQFPC5DES");
     By BTNOPSIMULAR = By.id("BTNOPSIMULAR");
     By BTNOPDESCARTAR = By.id("BTNOPDESCARTAR");
     By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
     By BTN_SI = By.id("BTNCONFIRMATION");
     By BTN_NO = By.id("BTNCANCELCONFIRMATION");
    // By BTNCONFIRMATION = By.id("BTNCONFIRMATION");
     By ValorCuotaAprox = By.name("_BNQFPC5CUO");
     By ValorTna = By.name("_BNQFPC5TNA");
     By ValorTem = By.name("_BNQFPC5TEM");
     By ValorTea = By.name("_BNQFPC5TEA");
     By CheckCalificacion = By.name("_BNQFPC5CBE");
     By CheckPrestamo = By.name("_BNQFPC5PP");
     By CheckTarjeta = By.name("_BNQFPC5TC");
     By CheckCtaCte = By.name("_CTACTE");
     By CheckCaDolar = By.name("_CA_DOLARES");
     By CheckTC1= By.name("_TCSEL_0001");
     By CheckTC2 = By.name("_TCSEL_0002");
     By BTNOPPAQUETIZAR = By.id("BTNOPPAQUETIZAR");
     By SelectCircuito = By.name("_CICUITOS_CALIF_E");
     By BTNOPADHESION_SERVICIOS = By.name("BTNOPADHESION_SERVICIOS");
     By BTNOPCERRAR = By.id("BTNOPCERRAR");

    //Categoria Acuerdo BI
     By tablaAcuerdo = By.id("TBL118");
     By spanTituloAcc = By.id("HTMLTXTTITLE395");
     By checkActualizarAcc = By.id("_ACTUALIZAACC");
     By inputMontoActualAcc = By.id("span__JBNYC5ACIM");
     By inputMontoNuevoAcc = By.id("_JBNYC5ACIM_NUEVO");

    public SimulacionProductosPage(WebDriver driver){

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


