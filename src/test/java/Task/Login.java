package Task;

import Config.Credenciales;
import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import java.awt.*;


public class Login {
    WebDriver driver;


    public Login(WebDriver driver) {

        this.driver = driver;
    }


    public void setUserName(String strUserName) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.UserInput ).sendKeys ( strUserName );

    }

    public void loginButton() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.LoginButton ).click ();


    }

    public void setPassword(String strPassword) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.PasswordInput ).sendKeys ( strPassword );

    }



}
