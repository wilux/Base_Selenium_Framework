package Action;


import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard {
    WebDriver driver;


    public Keyboard(WebDriver driver) {

        this.driver = driver;

    }

    public void Ctrl(char character) throws AWTException {
        Robot robot = new Robot ();
        robot.keyPress ( KeyEvent.VK_CONTROL );

        switch (character) {
            case 'a':
                robot.keyPress ( KeyEvent.VK_A );
                break;
            case 'b':
                robot.keyPress ( KeyEvent.VK_B );
                break;
            case 'c':
                robot.keyPress ( KeyEvent.VK_C );
                break;
            case 'd':
                robot.keyPress ( KeyEvent.VK_D );
                break;
            case 'e':
                robot.keyPress ( KeyEvent.VK_E );
                break;
            case 'f':
                robot.keyPress ( KeyEvent.VK_F );
                break;
            case 'g':
                robot.keyPress ( KeyEvent.VK_G );
                break;
            case 'h':
                robot.keyPress ( KeyEvent.VK_H );
                break;
            case 'i':
                robot.keyPress ( KeyEvent.VK_I );
                break;
            case 'j':
                robot.keyPress ( KeyEvent.VK_J );
                break;
            case 'k':
                robot.keyPress ( KeyEvent.VK_K );
                break;
            case 'l':
                robot.keyPress ( KeyEvent.VK_L );
                break;
            case 'm':
                robot.keyPress ( KeyEvent.VK_M );
                break;
            case 'n':
                robot.keyPress ( KeyEvent.VK_N );
                break;
            case 'o':
                robot.keyPress ( KeyEvent.VK_O );
                break;
            case 'p':
                robot.keyPress ( KeyEvent.VK_P );
                break;
            case 'q':
                robot.keyPress ( KeyEvent.VK_Q );
                break;
            case 'r':
                robot.keyPress ( KeyEvent.VK_R );
                break;
            case 's':
                robot.keyPress ( KeyEvent.VK_S );
                break;
            case 't':
                robot.keyPress ( KeyEvent.VK_T );
                break;
            case 'u':
                robot.keyPress ( KeyEvent.VK_U );
                break;
            case 'v':
                robot.keyPress ( KeyEvent.VK_V );
                break;
            case 'w':
                robot.keyPress ( KeyEvent.VK_W );
                break;
            case 'x':
                robot.keyPress ( KeyEvent.VK_X );
                break;
            case 'y':
                robot.keyPress ( KeyEvent.VK_Y );
                break;
            case 'z':
                robot.keyPress ( KeyEvent.VK_Z );
                break;
        }

    }
}


