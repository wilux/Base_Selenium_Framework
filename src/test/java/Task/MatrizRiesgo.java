package Task;

import Action.Click;
import Action.Get;
import Action.Grid;
import Action.Radio;
import Page.MatrizRiesgoPage;
import Page.ReutilizacionABMProductosPage;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MatrizRiesgo extends MatrizRiesgoPage {
    WebDriver driver;


    public MatrizRiesgo(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }


    public void Confirmar() throws InterruptedException {
        Click click = new Click ( driver );
        Get get = new Get ( driver );
        final Stopwatch stopwatch = Stopwatch.createStarted ();
        click.On ( BTNOPCONFIRMAR );

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            if ( !get.Habilitado ( BTNOPCONFIRMAR ) ) {
                break;
            }
            else {
                click.On ( BTNOPCONFIRMAR );
            }
        }
        click.On ( BTNOPCERRAR );
    }


    public void ConfirmarFinal() throws InterruptedException {
        Click click = new Click ( driver );
        Get get = new Get ( driver );
        Radio radio = new Radio ( driver );
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        radio.On ( Radio_Si, 0 );
        click.On ( BTNOPCONFIRMAR );

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            if ( !get.Habilitado ( BTNOPCONFIRMAR ) ) {
                break;
            }
            else {
                click.On ( BTNOPCONFIRMAR );
            }
        }
        click.On ( BTNOPCERRAR );
    }


}
