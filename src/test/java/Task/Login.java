package Task;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;


public class Login {
    WebDriver driver;


    public Login(WebDriver driver) {

        this.driver = driver;
    }


    public void setUserName(String username) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.username ).sendKeys ( username );

    }
    public void setPassword(String password) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.password ).sendKeys ( password );

    }

    public void loginButton(){
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.LoginButton ).click ();


    }




}
