package Page;


import Config.Credenciales;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


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

    public void LoginButton() throws InterruptedException {

        driver.findElement(LoginButton).click();


        // To handle parent window
        String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is " + MainWindow);

        // To handle child window
        Set<String> s1 = driver.getWindowHandles();
        System.out.println("Child window handle is" + s1);
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                String pageTitle=driver.getTitle();
                System.out.println("The web page title of child window is:"+pageTitle);
                driver.manage().window().maximize();
                break;
            }
        }


}


    public void loginToBT(String strUserName,String strPasword) throws InterruptedException {

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.LoginButton();
    }

    public void Ingresar() throws InterruptedException {


        driver.get("http://btwebqa.ar.bpn/BTWeb/hlogin.aspx");

        setUserName(username);
        setPassword(password);
        LoginButton();

    }



}


