package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    public By username = By.xpath ( "//input[@id='username']" );
    public By password = By.xpath ( "//input[@id='password']" );
    public By LoginButton = By.cssSelector ( ".loginButton" );



    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

}


