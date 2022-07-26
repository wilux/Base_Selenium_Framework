package Config;

import Action.*;
import Task.*;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Acciones {
    WebDriver driver;

    public Acciones(WebDriver driver) {
        this.driver = driver;
    }



    public Login login() {
        Login login = new Login ( driver );
        return login;
    }


    public CheckBox checkBox() {
        CheckBox checkBox = new CheckBox ( driver );
        return checkBox;
    }

    public Radio radio() {
        Radio radio = new Radio ( driver );
        return radio;
    }

    public Choose choose() {
        Choose choose = new Choose ( driver );
        return choose;
    }

    public Click click() {
        Click click = new Click ( driver );
        return click;
    }

    public Keyboard keyboard() throws AWTException {
        Keyboard keyboard = new Keyboard ();
        return keyboard;
    }

    public Get get() {
        Get get = new Get ( driver );
        return get;
    }

    public Write write() {
        Write write = new Write ( driver );
        return write;
    }

    public Grid grid() {
        Grid grid = new Grid ( driver );
        return grid;
    }

}
