package Config;

import Task.*;
import org.openqa.selenium.WebDriver;

public class Accion {
    WebDriver driver;

    public Accion(WebDriver driver) {
        this.driver = driver;
    }

    public BandejaTareas bandejaTareas() {
        BandejaTareas bandejaTareas = new BandejaTareas ( driver );
        return bandejaTareas;
    }

    public CierreCuentas cierreCuentas() {
        CierreCuentas cierreCuentas = new CierreCuentas ( driver );
        return cierreCuentas;
    }

    public Ejecutar ejecutar() {
        Ejecutar ejecutar = new Ejecutar ( driver );
        return ejecutar;
    }


    public Entrevista entrevista() {
        Entrevista entrevista = new Entrevista ( driver );
        return entrevista;
    }

    public Login login() {
        Login login = new Login ( driver );
        return login;
    }

    public Menu menu() {
        Menu menu = new Menu ( driver );
        return menu;
    }

    public Simulacion simulacion() {
        Simulacion simulacion = new Simulacion ( driver );
        return simulacion;
    }
}
