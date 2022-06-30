package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPanelGenericoPage {
    //Localizadores
    //HTMLTXTTITLE1
    // By Titulo = By.CssSelector(".MainTitle");
    public By Titulo = By.id ( "HTMLTXTTITLE1" );
    public By Titulo2 = By.xpath ( "//span[@class='MainTitle']" );
    public By Mensaje = By.cssSelector ( ".MsgText" );
    // By Wait = By.XPath("//img[@src='http://btwebqa.ar.bpn/BTWeb/images/wait.gif']");
    public By Cargando = By.id ( "waitMessage" );
    WebDriver driver;

    public WebPanelGenericoPage(WebDriver driver) {

        this.driver = driver;

    }


}


