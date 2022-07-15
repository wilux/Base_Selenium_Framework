package Task;

import Config.Credenciales;
import Page.LoginPage;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Login {
    WebDriver driver;


    public Login(WebDriver driver) {

        this.driver = driver;
    }


    //Set user name in textbox

    public void setUserName(String strUserName) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.UserInput ).sendKeys ( strUserName );

    }

    public void loginButton() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage ( driver );
//        System.out.println ( "Driver cuando quiero hacer click en LoginButton " + driver.toString () );
        driver.findElement ( loginPage.LoginButton ).click ();
//        Robot robot = new Robot ();


//
//        robot.keyPress ( KeyEvent.VK_CONTROL );
//        Thread.sleep ( 200 );
//        robot.keyPress ( KeyEvent.VK_SUBTRACT );


//        robot.keyPress ( KeyEvent.VK_TAB );
//        robot.keyPress ( KeyEvent.VK_ENTER );
//        robot.keyRelease ( KeyEvent.VK_TAB );
//        robot.keyRelease ( KeyEvent.VK_ENTER );

    }

    public void setPassword(String strPassword) {
        LoginPage loginPage = new LoginPage ( driver );
        driver.findElement ( loginPage.PasswordInput ).sendKeys ( strPassword );

    }

    public void cambiarVentana() {
//        LoginPage loginPage = new LoginPage ( driver );
//        driver.findElement ( loginPage.LoginButton ).click ();


        // To handle parent window
        String MainWindow = driver.getWindowHandle ();
//        System.out.println("Main window handle is " + MainWindow);

        // To handle child window
        Set<String> s1 = driver.getWindowHandles ();
//        System.out.println ( "Child window handle is" + s1 );
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


    public void loginToBT(String strUserName, String strPassword) throws InterruptedException, AWTException {

        //Fill user name

        this.setUserName ( strUserName );

        //Fill password

        this.setPassword ( strPassword );

        //Click Login button
        loginButton ();
        Thread.sleep ( 2000 );
        cambiarVentana ();
    }

    public void Ingresar(String ambiente) throws InterruptedException, AWTException {

        Credenciales credenciales = new Credenciales ();
//        System.out.println ( "Driver en Login " + driver.toString () );
        if ( ambiente.equals ( "DF" ) ) {

            driver.get ( "http://btdesafuncional.ar.bpn/BTWeb/hlogin.aspx" );
        }
        else if ( ambiente.equals ( "QA" ) ) {

            driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
        }
        else {
            System.out.println ( "El Ambiente elegido " + ambiente + " no es valido, se asume QA" );
            System.out.println ( "Ambientes validos QA o DF" );
            driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
        }

        setUserName ( credenciales.username );
        setPassword ( credenciales.password );


        loginButton ();
        cambiarVentana ();

    }


    public void IngresarManual(String ambiente) throws InterruptedException, AWTException {


        JTextField usuario = new JTextField ( 10 );
        JTextField password = new JPasswordField ( 10 );

        JPanel myPanel = new JPanel ();
        myPanel.add ( new JLabel ( "Usuario:" ) );
        myPanel.add ( usuario );
        myPanel.add ( Box.createHorizontalStrut ( 15 ) ); // a spacer
        myPanel.add ( new JLabel ( "Password:" ) );
        myPanel.add ( password );

        int result = JOptionPane.showConfirmDialog ( null, myPanel,
                                                     "Ingresa tus credenciales de BT para iniciar " +
                                                             "Prueba Automatizada", JOptionPane.OK_CANCEL_OPTION );
        if ( result == JOptionPane.OK_OPTION ) {


            if ( ambiente.equals ( "DF" ) ) {

                driver.get ( "http://btdesafuncional.ar.bpn/BTWeb/hlogin.aspx" );
            }
            else if ( ambiente.equals ( "QA" ) ) {

                driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
            }
            else {
                System.out.println ( "El Ambiente elegido " + ambiente + " no es valido, se asume QA" );
                System.out.println ( "Ambientes validos QA o DF" );
                driver.get ( "http://btwebqa.ar.bpn/BTWeb/hlogin.aspx" );
            }

            setUserName ( usuario.getText () );
            setPassword ( password.getText () );


            loginButton ();
            cambiarVentana ();
        }
        else {
            Assert.fail ( "Prueba no iniciada por falta de credenciales" );
        }

    }


}
