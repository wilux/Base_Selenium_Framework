package Action;

import Tools.Frame;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Click {
    WebDriver driver;


    public Click(WebDriver driver) {

        this.driver = driver;

    }

    public void On(By locator) {
        Frame frame = new Frame ( driver );
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            if ( frame.BuscarFrame ( locator ) ) {
                break;
            }
            else {
                System.out.println ( "Frame encontrado? " + frame.BuscarFrame ( locator ) );
                System.out.println ( "Buscando Frame para " + locator );
                System.out.println ( "Tiempo " + stopwatch.elapsed ( TimeUnit.SECONDS ) );
            }
        }

        try {

            driver.findElement ( locator ).click ();
            System.out.println ( "Click Avanzado en " + locator );


        } catch (Exception e) {
            System.out.println ( "No se encontró " + locator );
            try {
                driver.findElement ( locator ).click ();
                System.out.println ( "Click Basico en " + locator );
            } catch (Exception i) {
                System.out.println ( "No se encontró con click basico " + locator );

            }
        }


    }
}

