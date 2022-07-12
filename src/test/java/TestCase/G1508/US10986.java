package TestCase.G1508;

import Config.Accion;
import Config.BaseTest;
import Page.EdicionPaquetePage;
import Task.*;
import Tools.SQLDatabaseConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static Tools.extentreports.ExtentTestManager.startTest;


public class US10986 extends BaseTest {


    @Test(priority = 1, description = "TASK 10972 - Agregar 3 campos  a ABM paquetes")
    public void IniciarAbmPaquetes(Method method) throws InterruptedException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( "SERPILLOE" );

        Accion accion = new Accion ( driver );
        AbmPaquetes abmPaquetes = new AbmPaquetes ( driver );
        EdicionPaquetePage edicionPaquetePage = new EdicionPaquetePage ( driver );

        accion.login ().Ingresar ( "QA" );
        abmPaquetes.Iniciar ();
        abmPaquetes.Filtrar ( "9" );
        abmPaquetes.Estado ( "A" );
        abmPaquetes.SeleccionarFila ();
        abmPaquetes.Edicion ();

    }

    @Test(priority = 2, description = "TASK 10972 - Campo 1")
    public void ControlarCampoA(Method method) throws InterruptedException {

        Accion accion = new Accion ( driver );
        EdicionPaquetePage edicionPaquetePage = new EdicionPaquetePage ( driver );

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10972 - Controlando existencia de campo selectJBNYC5TCA" );

        Assert.assertTrue ( accion.get ().Existe ( edicionPaquetePage.selectJBNYC5TCA ) );

    }

    @Test(priority = 3, description = "TASK 10972 - Campo 1")
    public void ControlarCampoB(Method method) throws InterruptedException {

        Accion accion = new Accion ( driver );
        EdicionPaquetePage edicionPaquetePage = new EdicionPaquetePage ( driver );

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10972 - Controlando existencia de campo selectJBNYC5TCA" );


        Assert.assertTrue ( accion.get ().Existe ( edicionPaquetePage.input_JBNYC5POR ) );

    }

    @Test(priority = 4, description = "TASK 10972 - Campo 1")
    public void ControlarCampoC(Method method) throws InterruptedException {

        Accion accion = new Accion ( driver );
        EdicionPaquetePage edicionPaquetePage = new EdicionPaquetePage ( driver );

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10972 - Controlando existencia de campo selectJBNYC5TCA" );


        Assert.assertTrue ( accion.get ().Existe ( edicionPaquetePage.input_JBNYC5TOA ) );
    }
}
