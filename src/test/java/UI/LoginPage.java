package UI;


import Config.Credenciales;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public  class LoginPage extends Credenciales
{
    WebDriver driver;

    By UserInput = By.id("_USER");
    By PasswordInput = By.id("_PASSWORD");
    By LoginButton = By.id("BTNOPINICIARSESION");

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }


    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(UserInput).sendKeys(strUserName);

    }


    public void setPassword(String strPasword){

        driver.findElement(PasswordInput).sendKeys(strPasword);

    }

    public void LoginButton(){

        driver.findElement(LoginButton).click();
        System.out.println("Click Boton");

    }


    public void loginToBT(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.LoginButton();
    }

    public void Ingresar()  {


        driver.get("http://btwebqa.ar.bpn/BTWeb/hlogin.aspx");

        setUserName(username);
        setPassword(password);
        LoginButton();

    }



}


