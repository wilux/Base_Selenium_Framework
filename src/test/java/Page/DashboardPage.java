package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage {

    //Menu
    public By PerfiladorIcon = By.xpath("//li[.='Perfilador']");

    WebDriver driver;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;

    }

}


