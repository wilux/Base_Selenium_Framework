package TestCase.G775;

import Config.Accion;
import Config.BaseTest;
import Tools.SQLDatabaseConnection;
import Tools.Screenshot;
import Tools.Tna;
import Tools.logs.Log;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class TasaTnaPorPuntosTest extends BaseTest {

    //Sin Paquete Existente
    String NroEntrevistaSinPaquete = "1283719";
    //Con Paquete Existente
    String NroEntrevistaConPaquete = "1283722";

    @BeforeTest
    public void IniciarSimulacion() {

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );

        //Inicio Como usuario de Plataforma
        bd.CambiarUsuario ( "SERPILLOE" );

        //Logueamos
        accion.login ().Ingresar ( "QA" );

        //Menu Ejecutar
        accion.menu ().Ejecutar ();
        //Abrir BandejaTareas
        accion.ejecutar ().Programa ( "hxwf900" );


    }


    @Test(priority = 0)
    public void TestSinPaqueteExistenteLlevaSinPaquete() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente con Sin Paquete Existente, llevando un " +
                                "MonoProducto sin puntos Particulares ni Generales" );
        Thread.sleep ( 3000 );
        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );

        //Iniciamos simulacion para entrevista generada
        accion.bandejaTareas ().ejecutarEntrevista ( NroEntrevistaSinPaquete );

        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaSinPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 0 -> CA. COMUN = Sin paquete
        accion.simulacion ().Paquete ( paquetes.get ( 0 ) );
        Thread.sleep ( 3000 );


        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si la Tasa Base = TNA " );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Assert.assertTrue ( tnaBase == tnaSimulado );

    }

    @Test(priority = 1)
    public void TestSinPaqueteLlevaPaqConPtosParticulares() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente con SinPaquete Existente, llevando un " +
                                "Paquete Con puntos Particulares y Generales" );
        Thread.sleep ( 3000 );
        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );

        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaSinPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 3 -> BPN SELECTO
        accion.simulacion ().Paquete ( paquetes.get ( 3 ) );
        Thread.sleep ( 5000 );

        String sqlPuntosGrales = "select JBNYC5TABO from JBNYC5 where JBNYC5Desc='" + paquetes.get ( 3 ) + "'";
        String sqlPuntosParticulares = "select BNQFCD3Bon from  BNQFCD3 where BNQFCD3PQT=3 and BNQFCD3Top=201";

        double ptosGenerales = Double.parseDouble ( bd.getValue ( sqlPuntosGrales ) );
        double ptosParticulares = Double.parseDouble ( bd.getValue ( sqlPuntosParticulares ) );
        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si TNA Simulado = TASA Base - Ptos Particulares " );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "Ptos Particulares = " + ptosParticulares );
        Assert.assertTrue ( tnaSimulado == tnaBase - ptosParticulares );

    }

    @Test(priority = 2)
    public void TestSinPaqueteLlevaPaqConPuntosGralesSinPtoParticulares() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente Sin Paquete Existente, llevando un " +
                                "Prestamo con paquete Sin puntos Particulares solo Generales" );
        Thread.sleep ( 3000 );
        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );

        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaSinPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 4 -> BPN UNICO
        accion.simulacion ().Paquete ( paquetes.get ( 4 ) );
        Thread.sleep ( 5000 );

        String sqlPuntosGrales = "select JBNYC5TABO from JBNYC5 where JBNYC5Desc='" + paquetes.get ( 4 ) + "'";
        String sqlPuntosParticulares = "select BNQFCD3Bon from  BNQFCD3 where BNQFCD3PQT=2 and BNQFCD3Top=201";

        double ptosGenerales = Double.parseDouble ( bd.getValue ( sqlPuntosGrales ) );
        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si TNA Simulado = TASA Base - Ptos Generales " );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "Ptos Particulares = " + ptosGenerales );
        Assert.assertTrue ( tnaSimulado == tnaBase - ptosGenerales );

        //Dejo en Bandeja Tareas
        accion.simulacion ().Cerrar ();

    }


    //Cliente tiene paquete BPN PLus Existente

    @Test(priority = 3)
    public void TestConPaqueteLlevaPrestamoConMonoproductoSinPtosParticulares() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente con Paquete Existente, llevando un " +
                                "MonoProducto sin puntos Particulares solo Generales" );
        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );


        //Iniciamos simulacion para entrevista generada
        accion.bandejaTareas ().ejecutarEntrevista ( NroEntrevistaConPaquete );

        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaConPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 0 -> CA. COMUN = Sin paquete
        accion.simulacion ().Paquete ( paquetes.get ( 0 ) );
        Thread.sleep ( 5000 );

        String sqlPuntosGrales = "select JBNYC5TABO from JBNYC5 where JBNYC5Desc='BPN PLUS'";
        String sqlPuntosParticulares = "select BNQFCD3Bon from  BNQFCD3 where BNQFCD3PQT=0 and BNQFCD3Top=201";

        double ptosGenerales = Double.parseDouble ( bd.getValue ( sqlPuntosGrales ) );
        double ptosParticulares = 0.0;
        try {
            ptosParticulares = Double.parseDouble ( bd.getValue ( sqlPuntosParticulares ) );
        } catch (Exception e) {

        }
        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si TNA Simulado = TASA Base - Ptos Generales " );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "Ptos Generales = " + ptosGenerales );

        Assert.assertTrue ( tnaSimulado == tnaBase - ptosGenerales - ptosParticulares );

    }

    @Test(priority = 4)
    public void TestConPaqueteConPtosParticularesHaceUpgradeConPtosParticulares() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente con Paquete Existente, llevando un " +
                                "upgrade de Paquete con puntos Particulares para la linea" );
        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );
        Screenshot screenshot = new Screenshot ( driver );

        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaConPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 3 -> BPN SELECTO
        accion.simulacion ().Paquete ( paquetes.get ( 3 ) );
        Thread.sleep ( 5000 );

        String sqlPuntosGrales = "select JBNYC5TABO from JBNYC5 where JBNYC5Desc='" + paquetes.get ( 3 ) + "'";
        String sqlPuntosParticulares = "select BNQFCD3Bon from  BNQFCD3 where BNQFCD3PQT=3 and BNQFCD3Top=201";

        double ptosGenerales = Double.parseDouble ( bd.getValue ( sqlPuntosGrales ) );
        double ptosParticulares = Double.parseDouble ( bd.getValue ( sqlPuntosParticulares ) );
        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si TNA Simulado = TASA Base - Ptos Particulares " );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "Ptos Particulares = " + ptosParticulares );

        Assert.assertTrue ( tnaSimulado == tnaBase - ptosParticulares );

    }

    @Test(priority = 5)
    public void TestConPaqueteConPuntosHaceUpgradePaqSinPtoParticulares() throws InterruptedException {
        Log.reportLog ( "Simulacion Prestamo de un cliente con Paquete Existente, llevando un " +
                                "upgrade de Paquete sin puntos Particulares para la linea solo Generales" );

        //Instanciamos clases que usaremos
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();
        Accion accion = new Accion ( driver );
        Screenshot screenshot = new Screenshot ( driver );
        //Linea 309/201
        //TNA BASE = 73
        Tna tna = new Tna ();
        double tnaBase = tna.getTnaEntrevista ( "309", "201", NroEntrevistaConPaquete );


        //Lista de Paquete
        List<String> paquetes = Arrays.asList ( "CA. COMUN", "BPN CLASICO", "BPN PLUS",
                                                "BPN SELECTO", "BPN UNICO", "BPN UNICO +" );

        //Elegimos Paquete 4 -> BPN UNICO
        accion.simulacion ().Paquete ( paquetes.get ( 4 ) );
        Thread.sleep ( 5000 );

        String sqlPuntosGrales = "select JBNYC5TABO from JBNYC5 where JBNYC5Desc='" + paquetes.get ( 4 ) + "'";
        String sqlPuntosParticulares = "select BNQFCD3Bon from  BNQFCD3 where BNQFCD3PQT=2 and BNQFCD3Top=201";

        double ptosGenerales = Double.parseDouble ( bd.getValue ( sqlPuntosGrales ) );
        double tnaSimulado = Double.parseDouble ( accion.simulacion ().Tna () );

        Log.reportLog ( "La prueba es exitosa si TNA Simulado = TASA Base - Ptos Generales " );
        Log.reportLog ( "TNA Simulado = " + tnaSimulado );
        Log.reportLog ( "Tasa Base = " + tnaBase );
        Log.reportLog ( "Ptos Generales = " + ptosGenerales );

        Assert.assertTrue ( tnaSimulado == tnaBase - ptosGenerales );

    }
}
