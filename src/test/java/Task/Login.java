package Task;

import Page.LoginPage;
import Tools.logs.JSErrorLogs;
import Tools.logs.Log;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class Login extends LoginPage {
    WebDriver driver;


    public Login(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }


    //Set user name in textbox

    public void setUserName(String strUserName) {

        driver.findElement ( UserInput ).sendKeys ( strUserName );

    }


    public void setPassword(String strPassword) {

        driver.findElement ( PasswordInput ).sendKeys ( strPassword );

    }

    public void LoginButton() {

        driver.findElement ( LoginButton ).click ();


        // To handle parent window
        String MainWindow = driver.getWindowHandle ();
//        System.out.println("Main window handle is " + MainWindow);

        // To handle child window
        Set<String> s1 = driver.getWindowHandles ();
        System.out.println ( "Child window handle is" + s1 );
        for (String ChildWindow : s1) {
            if ( !MainWindow.equalsIgnoreCase ( ChildWindow ) ) {
                driver.switchTo ().window ( ChildWindow );
                //String pageTitle = driver.getTitle ();
                //System.out.println("The web page title of child window is:"+pageTitle);
                driver.manage ().window ().maximize ();
                break;
            }
        }


    }


    public void loginToBT(String strUserName, String strPassword) {

        //Fill user name

        this.setUserName ( strUserName );

        //Fill password

        this.setPassword ( strPassword );

        //Click Login button

        this.LoginButton ();
    }

    public void Ingresar() {


        driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
        //driver.get ( "http://btdesafuncional.ar.bpn/BTWeb/hlogin.aspx" );

        setUserName ( username );
        setPassword ( password );
        LoginButton ();

    }
}
