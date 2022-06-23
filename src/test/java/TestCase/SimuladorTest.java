package TestCase;

import Action.Click;
import Action.Choose;
import Action.Write;
import Config.BaseTest;
import Page.*;
import Task.CompletarEntrevista;
import Tools.Frame;
import Tools.Grid;
import Tools.SQLDatabaseConnection;
import Tools.Screenshot;
import org.testng.annotations.Test;


public class SimuladorTest extends BaseTest {


    @Test
    //Tests google calculator
    public void Simular() throws InterruptedException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection();
        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario("SERPILLOE");

        //Login
        LoginPage login = new LoginPage(driver);
        login.Ingresar();

        Grid grid = new Grid(driver);
        Click click = new Click(driver);
        Write write = new Write(driver);
        MenuPage menu = new MenuPage(driver);
        Choose choose = new Choose(driver);
        EjecutarPage ejecutar = new EjecutarPage(driver);
        BandejaTareasPage bandejaTareasPage = new BandejaTareasPage(driver);
        EntrevistaPage entrevistaPage = new EntrevistaPage(driver);
        CompletarEntrevista completarEntrevista = new CompletarEntrevista (driver);

        Frame frame = new Frame(driver);
        Screenshot screenshot = new Screenshot(driver);

        //Menu Ejecutar
        menu.Ejecutar();
        //Abrir BandejaTareas
        ejecutar.Programa("hxwf900");

        //Abrir Entrevista
        click.On(bandejaTareasPage.BTNOPOINICIAR);
        grid.rowSelectbyText(bandejaTareasPage.Proceso_Tareas, "Entrevista / Identificación");
        click.On(bandejaTareasPage.BTNOPOINICIAR);

        //Ingresar Tipo y Documento
        completarEntrevista.IdentificacionPersona("C.U.I.L.","27014506069" );
        //Entrevista
        completarEntrevista.Modalidad("No Presencial");
        completarEntrevista.DatosPersonales();
        }
    }
