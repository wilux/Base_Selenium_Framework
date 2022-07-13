package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BandejaTareasPage {
    //Mensajes
    public By MsgTextArriba = By.className ( "MsgText" );
    public By MsgTextMedio = By.className ( "HTMLTXTTEXT1" );
    public By MsgTextAbajo = By.className ( "HTMLTXTTEXT5" );

    public By Grilla_Tareas = By.id ( "GRIDINBOX" );
    public By Proceso_Tareas = By.id ( "HTMLTBLPROCESOSYTAREAS" );
    public By PrimerTarea = By.id ( "span__IDINSTANCIA_0001" );
    public By SegundaTarea = By.id ( "span__IDINSTANCIA_0002" );
    public By PrimerAsunto = By.id ( "span__ASUNTO_0001" );
    public By spanComentarioFila = By.id ( "span__COMENTARIOS_0001" );
    public By spanTareaFila = By.id ( "span__TAREA_0001" );
    public By BTNFILTER_INBOX = By.id ( "BTNFILTER_INBOX" );
    public By BTNOPOSIGUIENTE = By.id ( "BTNOPOSIGUIENTE" );
    public By BTNCONFIRMATION = By.id ( "BTNCONFIRMATION" );
    public By BTNOPOEJECUTAR = By.id ( "BTNOPOEJECUTAR" );
    public By BTNOPDESCARTAR = By.id ( "BTNOPDESCARTAR" );
    public By BTNOPOINICIAR = By.id ( "BTNOPOINICIAR" );
    public By BTNOPOTOMAR = By.id ( "BTNOPOTOMAR" );
    public By InputBuscarAsunto = By.id ( "_BASU" );
    WebDriver driver;

    public BandejaTareasPage(WebDriver driver) {

        this.driver = driver;

    }


}


