package Task;

import Action.Click;
import Action.Write;
import Page.BandejaTareasPage;
import Tools.Grid;
import org.openqa.selenium.WebDriver;

public class BandejaTareas extends BandejaTareasPage {
    WebDriver driver;


    public BandejaTareas(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }

    public void filtrar(String nroEntrevista) throws InterruptedException {
        //Buscar entrevista
        Click click = new Click ( driver );
        Write write = new Write ( driver );
        write.Js ( InputBuscarAsunto, nroEntrevista );
        click.On ( BTNFILTER_INBOX );
        Thread.sleep ( 1000 );
    }

    public void iniciarEntrevista(String tarea) {
        //Iniciar nueva Entrevista
        Grid grid = new Grid ( driver );
        Click click = new Click ( driver );
        click.On ( BTNOPOINICIAR );
        grid.rowSelectbyText ( Proceso_Tareas, tarea );
        click.On ( BTNOPOINICIAR );
    }

    //Tomar
    public void tomarEntrevista(String nroEntrevista) throws InterruptedException {
        //frame.BuscarFrame ( bandejaTareasPage.Grilla_Tareas );
        Click click = new Click ( driver );
        Grid grid = new Grid ( driver );

        //Buscar entrevista
        filtrar ( nroEntrevista );
        //Tomar primer fila

        grid.rowSelectbyFila ( Grilla_Tareas, PrimerTarea );
        //driver.findElement ( BTNOPOTOMAR ).click ();
        click.On ( BTNOPOTOMAR );

    }

    //Ejecutar
    public void ejecutarEntrevista(String nroEntrevista) throws InterruptedException {
        //frame.BuscarFrame ( bandejaTareasPage.Grilla_Tareas );
        Click click = new Click ( driver );
        Grid grid = new Grid ( driver );

        //Buscar entrevista
        filtrar ( nroEntrevista );
        //Tomar primer fila

        grid.rowSelectbyFila ( Grilla_Tareas, PrimerTarea );
        click.On ( BTNOPOEJECUTAR );
        //driver.findElement ( BTNOPOTOMAR ).click ();
    }

    //Siguiente
    public void siguienteEntrevista(String nroEntrevista) throws InterruptedException {
        //frame.BuscarFrame ( bandejaTareasPage.Grilla_Tareas );
        Click click = new Click ( driver );
        Grid grid = new Grid ( driver );

        //Buscar entrevista
        filtrar ( nroEntrevista );
        //Tomar primer fila

        grid.rowSelectbyFila ( Grilla_Tareas, PrimerTarea );
        click.On ( BTNOPOSIGUIENTE );
        click.On ( BTNCONFIRMATION );
    }

}
