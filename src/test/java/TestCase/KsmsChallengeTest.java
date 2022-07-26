package TestCase;

import Config.Acciones;
import Config.BaseTest;
import Page.PerfiladorPage;
import Task.Dashboard;
import Task.Login;
import Task.Perfilador;
import Tools.cadena;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class KsmsChallengeTest extends BaseTest {


    @Test(priority = 0, description = "Login Test Area")
    public void Login() {


        driver.get("http://ksms.mx/libertadqa/login/");
        driver.manage().window().maximize();

        Login login = new Login(driver);


        login.setUserName("tester");
        login.setPassword("Mexico.2081");
        login.loginButton();

        //Login Succesufull if "Perfilador" displayed.
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"barraIconos\"]/nav/ul/li[2]/a/span[1]/img")).isDisplayed());

    }

    @Test(priority = 1, description = "Perfilador Area")
    public void Dashboard() {

        Dashboard dashboard = new Dashboard(driver);
        dashboard.perfilador();
        Assert.assertTrue(driver.findElement(By.xpath("//h4[.='¿TU PROSPECTO ES CLIENTE LIBERTAD?']")).isDisplayed());
    }

    @Test(priority = 2, description = "Configurar Prospecto Cliente")
    public void Perfilador() throws InterruptedException {

        Perfilador perfilador = new Perfilador(driver);
        perfilador.clienteLibertad("No");
        perfilador.tipoIngresosPerfilador("Recibos de nómina con CFDI");
        perfilador.avanzarPerfilador();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(.,'1 - Datos Personales')]")).isDisplayed());

    }


    @Test(priority = 3, description = "1 - Datos Personales")
    public void DatosPersonales() throws InterruptedException {
        Perfilador perfilador = new Perfilador(driver);
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        perfilador.nombre("Nestor");
        perfilador.segundoNombre("Daniel");
        perfilador.apellidoPaterno("Flores");
        perfilador.apellidoMaterno("Alvarez");
        perfilador.correoElectronico("nestorchoele@gmail.com");
        perfilador.telefonoCelular("1111111111");
        perfilador.codigoVerficacion("111111");
        perfilador.telefonoCasa("1111111111");
        perfilador.fechaNacimiento("11", "Junio", "1986");
        perfilador.sexo("Hombre");
        perfilador.nacionalidad("MEXICO");
        perfilador.estadoNacimiento("AGUASCALIENTES");
        Assert.assertTrue(perfilador.siguiente());

        //Vivienda

        driver.findElement(perfiladorPage.inputCalle).sendKeys("Avenida Siempre Viva");
        Thread.sleep(500);
        driver.findElement(perfiladorPage.inputNumeroExterior).sendKeys("1213");
        Thread.sleep(500);
        driver.findElement(perfiladorPage.inputCodigoPostal).sendKeys("20263");
        Thread.sleep(500);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.selectColonia, "Agua Clara");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectColonia, "AGUASCALIENTES");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectDelegacion, "Aguascalientes");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectMesAntiguedadVivienda, "Enero");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectAnioAntiguedadVivienda, "2020");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectMesAntiguedadCiudad, "Enero");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectAnioAntiguedadCiudad, "2020");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectDependienteEconomicos, "0");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectHorarioContacto, "9 hrs a 12 hrs");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectTipoVivienda, "PROPIA");
        Thread.sleep(500);
        acciones.choose().byText(perfiladorPage.selectEstadoCivil, "SOLTERO");
        Thread.sleep(500);
        Assert.assertTrue(perfilador.siguiente());


        //Empleo
        acciones.choose().byText(By.name("empleoCliente_profesion"), "ABOGADO");
        acciones.choose().byText(By.name("empleoCliente_ocupacion"), "SIN OCUPACION");
        driver.findElement(By.name("empleoCliente_empresa")).sendKeys("Test");

        acciones.choose().byText(By.name("empleoCliente_antiguedad_mes"), "Enero");
        acciones.choose().byText(By.name("empleoCliente_antiguedad_anio"), "2010");

        driver.findElement(By.name("empleoCliente_ingresosFijos")).sendKeys("30000");
        driver.findElement(By.name("empleoCliente_ingresosVariables")).sendKeys("30000");

        Assert.assertTrue(perfilador.siguiente());

        //Consulta del Solicitante
        driver.findElement(By.name("consultaTradicional")).click();

        cadena cadena = new cadena();

        driver.findElement(By.name("cadenaBuroTest")).sendKeys(cadena.cadenaBuro);
        driver.findElement(By.cssSelector("#consulta-tradicional > div:nth-child(4) > div.center.col-xs-12.scrollmenu > button")).click();

    }

//
//    @Test(priority = 4, description = "2 - Vivienda")
//    public void Vivienda() throws InterruptedException {
//        Perfilador perfilador = new Perfilador(driver);
//
//        perfilador.nombre("Nestor");
//
//    }


}
