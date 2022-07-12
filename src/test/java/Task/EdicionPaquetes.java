package Task;

import Action.Choose;
import Action.Get;
import Page.SimulacionProductosPage;
import org.openqa.selenium.WebDriver;

public class EdicionPaquetes extends SimulacionProductosPage {
    WebDriver driver;


    public EdicionPaquetes(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }


}
