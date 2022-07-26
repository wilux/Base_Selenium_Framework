package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    //Menu
    public By menuPhones = By.xpath ( "//a[.='Phones']" );
    public By menuLaptos = By.xpath ( "//a[.='Laptops']" );
    public By menuMonitors = By.xpath ( "//a[.='Monitors']" );
    public By menuHome = By.xpath ( "//a[.='Home']" );
    public By menuContact = By.xpath ( "//a[.='Contact']" );
    public By menuAbout = By.xpath ( "//a[.='About us']" );
    public By menuCart = By.xpath ( "//a[.='Cart']" );
    public By menuLogIn = By.xpath ( "//a[.='Log in']" );
    public By menuSignUp = By.xpath ( "//a[.='Sign up']" );

    //Carrousel
    public By carrouselLeft = By.xpath ( "//span[@class='carousel-control-prev-icon']" );
    public By carrouselRigth = By.xpath ( "//span[@class='carousel-control-prev-icon']" );

    //Lista elementos

    public By listPrevious = By.xpath ( "//button[.='Previous']" );
    public By listNext = By.xpath ( "//button[.='Next']" );

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

}


