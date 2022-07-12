package TestCase.G1508;

import Config.Accion;
import Config.BaseTest;
import Page.EdicionPaquetePage;
import Task.AbmPaquetes;
import Tools.SQLDatabaseConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.sql.SQLException;

import static Tools.extentreports.ExtentTestManager.startTest;

public class US10972 extends BaseTest {


    // @Test(priority = 0, description = "Prueba de existencia de nuevas columna JBNYC5TCA en jbnyc5")
    public void Inicio(Method method) throws InterruptedException {

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( "SERPILLOE" );

        Accion accion = new Accion ( driver );
        AbmPaquetes abmPaquetes = new AbmPaquetes ( driver );
        EdicionPaquetePage edicionPaquetePage = new EdicionPaquetePage ( driver );

        accion.login ().Ingresar ( "QA" );

    }


    @Test(priority = 0, description = "Prueba de existencia de nuevas columna JBNYC5TCA en jbnyc5")
    public void exist_JBNYC5TCA(Method method) throws SQLException {

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10986 - Existe en jbnyc5 JBNYC5TCA  Tipo de Calculo" );

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();

        Assert.assertTrue ( bd.hasColumn ( "jbnyc5", "JBNYC5TCA" ) );

    }

    @Test(priority = 0, description = "Prueba de existencia de nuevas columna JBNYC5POR en jbnyc5")
    public void exist_JBNYC5POR(Method method) throws SQLException {

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10986 - Existe en jbnyc5 JBNYC5POR  Porcentaje de Tope" );

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();

        Assert.assertTrue ( bd.hasColumn ( "jbnyc5", "JBNYC5POR" ) );

    }

    @Test(priority = 0, description = "Prueba de existencia de nuevas columna JBNYC5TOA en jbnyc5")
    public void exist_JBNYC5TOA(Method method) throws SQLException {

        //ExtentReports Description
        startTest ( method.getName (), "TASK 10986 - Existe en jbnyc5 JBNYC5TOA Tope ACC" );

        SQLDatabaseConnection bd = new SQLDatabaseConnection ();

        Assert.assertTrue ( bd.hasColumn ( "jbnyc5", "JBNYC5TOA" ) );

    }

}
