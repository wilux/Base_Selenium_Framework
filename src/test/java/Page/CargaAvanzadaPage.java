package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CargaAvanzadaPage {
    public By Select_NivelEduc = By.id ( "_COMBONIVELEDUC" );
    public By inputApellidoPadre = By.id ( "_APEPADRE" );
    public By inputApellidoMadre = By.id ( "_APEMADRE" );
    public By inputNombrePadre = By.id ( "_NOMPADRE" );
    public By inputNombreMadre = By.id ( "_NOMMADRE" );
    public By BTNOPDOMICILIOREAL = By.id ( "BTNOPDOMICILIOREAL" );
    public By BTNOPBUSCARWC = By.id ( "BTNOPBUSCARWC" );
    public By inputOrigenFondos = By.id ( "_ORIGENFONDOS" );
    public By BTNOPACEPTAR = By.id ( "BTNOPACEPTAR" );
    public By BTNOPBTNCONFIRMAR = By.id ( "BTNOPBTNCONFIRMAR" );
    public By BTNOPBTNFINALIZAR = By.id ( "BTNOPBTNFINALIZAR" );
    public By BTN_SI = By.id ( "BTNCONFIRMATION" );
    public By BTN_NO = By.id ( "BTNCANCELCONFIRMATION" );
    public By BTNOPCONYUGE = By.id ( "BTNOPCONYUGE" );
    public By BTNOPMODIFICARDATOS = By.id ( "BTNOPMODIFICARDATOS" );
    public By Select_EstadoCivil = By.id ( "_COMBOESTCIV" ); //value 4 soltero
    WebDriver driver;
    //_COMBOESTCIV

    public CargaAvanzadaPage(WebDriver driver) {

        this.driver = driver;

    }


}


