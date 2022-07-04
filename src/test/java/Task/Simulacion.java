package Task;

import Action.Choose;
import Action.Get;
import Page.EjecutarPage;
import Page.SimulacionProductosPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Simulacion extends SimulacionProductosPage {
    WebDriver driver;


    public Simulacion(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }

    public void Paquete(String paquete) {

        Choose choose = new Choose ( driver );
        choose.byText ( SelectPaquete, paquete );

    }

    public boolean Existe() {

        Get get = new Get ( driver );

        return get.Visible ( SelectPaquete );

    }
}
