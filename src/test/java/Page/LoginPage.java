package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    public By username = By.xpath ( "//input[@id='loginusername']" );
    public By password = By.xpath ( "//input[@id='loginpassword']" );
    public By LoginButton = By.xpath ( "//button[.='Log in']" );

    public By CloseButton = By.xpath ( "//div[@id='logInModal']//button[@class='btn btn-secondary']" );


    public By welcome = By.cssSelector ( "#nameofuser" );

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

}


