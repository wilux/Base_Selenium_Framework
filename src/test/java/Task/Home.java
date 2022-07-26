package Task;

import Page.HomePage;
import Page.LoginPage;
import org.openqa.selenium.WebDriver;


public class Home {
    WebDriver driver;


    public Home(WebDriver driver) {

        this.driver = driver;
    }




    public void login(){
        HomePage homePage = new HomePage(driver);
        driver.findElement ( homePage.menuLogIn ).click ();

    }









}
