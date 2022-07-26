package Task;

import Config.Acciones;
import Page.DashboardPage;
import org.openqa.selenium.WebDriver;


public class Dashboard {
    WebDriver driver;


    public Dashboard(WebDriver driver) {

        this.driver = driver;
    }


    public void perfilador() {
        DashboardPage dashboardPage = new DashboardPage(driver);

        Acciones acciones = new Acciones(driver);
        acciones.click().On(dashboardPage.PerfiladorIcon);

    }


}
