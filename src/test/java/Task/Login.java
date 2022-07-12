package Task;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.Set;


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


    public void loginToBT(String strUserName, String strPassword) throws InterruptedException {

        //Fill user name

        this.setUserName ( strUserName );

        //Fill password

        this.setPassword ( strPassword );

        //Click Login button

        this.LoginButton ();
    }

    public void Ingresar(String ambiente) throws InterruptedException {

        if ( ambiente.equals ( "DF" ) ) {

            driver.get ( "http://btdesafuncional.ar.bpn/BTWeb/hlogin.aspx" );
        }
        else if ( ambiente.equals ( "QA" ) ) {

            driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
        }
        else {
            System.out.println ( "El Ambiente elegido " + ambiente + " no es valido, se asume QA" );
            System.out.println ( "El Ambientes validos QA o DF" );
            driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
        }

        setUserName ( username );
        setPassword ( password );
        LoginButton ();

    }
}
