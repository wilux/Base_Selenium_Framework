package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlanPagosAmortizablesPage {

    public By BTNOPCONFIRMAR = By.id ( "BTNOPCONFIRMAR" );
    public By BTNOPCOMISION = By.id ( "BTNOPCOMISION" );
    public By BTNOPIMPRIMIR = By.id ( "BTNOPIMPRIMIR" );
    public By checkPartida = By.name ( "_ASKSALTEA" );
    public By BTNOPRESUMEN = By.id ( "BTNOPRESUMEN" );
    public By BTNOPASIENTO = By.id ( "BTNOPASIENTO" );


    WebDriver driver;

    public PlanPagosAmortizablesPage(WebDriver driver) {

        this.driver = driver;

    }


}


