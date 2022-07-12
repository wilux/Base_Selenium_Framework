package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EdicionPaquetePage {
    //Localizadores


    public By label = By.name ( "FldText" );
    public By selectJBNYC5TCA = By.name ( "_JBNYC5TCA" );
    public By input_JBNYC5POR = By.name ( "_JBNYC5POR" );
    public By input_JBNYC5TOA = By.name ( "_JBNYC5TOA" );
    public By BTNOPCALCULARTOPEACC = By.name ( "BTNOPCALCULARTOPEACC" );

    WebDriver driver;

    public EdicionPaquetePage(WebDriver driver) {

        this.driver = driver;

    }


}


