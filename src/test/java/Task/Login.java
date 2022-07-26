package Task;

import Config.Credenciales;
import Page.LoginPage;
import Tools.logs.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


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

    public void closeButton() {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.CloseButton ).click ();


    }

    public boolean loginSuccessful() {
        LoginPage loginPage = new LoginPage ( driver );

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.welcome));

       return  firstResult.isDisplayed();

    }


    public boolean loginUnSuccessful() {
        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);

        // Accepting alert
        alert.accept();

        return alertMessage.equals("Wrong password.");

    }








}
