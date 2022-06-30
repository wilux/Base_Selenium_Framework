package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsultaBridgerInsightPage {
    public By BTNOPBUSCARBRIDGER = By.id ( "BTNOPBUSCARBRIDGER" );
    public By BTN_SinCoincidencia = By.id ( "BTNOPIMPRSCOINCIDENCIA" );
    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCERRAR = By.id ( "BTNOPCERRAR" );
    public By Volver_CargaAvanzada = By.linkText ( "CARGA AVANZADA" );
    WebDriver driver;

    public ConsultaBridgerInsightPage(WebDriver driver) {

        this.driver = driver;

    }


}


