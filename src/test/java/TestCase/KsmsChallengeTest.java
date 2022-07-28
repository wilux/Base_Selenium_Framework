package TestCase;


import Action.Choose;
import Action.Keyboard;
import Action.Write;
import Config.BaseTest;
import Tools.Cadena;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;


public class KsmsChallengeTest extends BaseTest {


    @Test
    public void Test() throws InterruptedException, AWTException {
        Choose choose = new Choose(driver);
        Write write = new Write (driver);
        Keyboard keyboard = new Keyboard ();

        driver.get("http://ksms.mx/libertadqa/login/auth?format=");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tester");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Mexico.2081");
        driver.findElement(By.cssSelector(".loginButton")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) img")).click();
        driver.findElement(By.id("clienteNo")).click();
        driver.findElement(By.id("tipoDeDocumento")).click();
        choose.byText(By.id("tipoDeDocumento"), "Recibos de nómina con CFDI");
        driver.findElement(By.id("avanzarPerfilador")).click();

        // 1 - Datos Personales
        driver.manage().window().fullscreen();
        driver.findElement(By.id("cliente_nombre")).click();
        driver.findElement(By.id("cliente_nombre")).sendKeys("Test1");
        driver.findElement(By.id("cliente_segundoNombre")).sendKeys("Test1");
        driver.findElement(By.id("cliente_apellidoPaterno")).sendKeys("Test1");
        driver.findElement(By.id("cliente_apellidoMaterno")).sendKeys("Test1");
        driver.findElement(By.id("emailCliente_emailPersonal")).click();
        driver.findElement(By.id("emailCliente_emailPersonal")).sendKeys("Test1@gmail.com");
        driver.findElement(By.id("telefonoCliente_telefonoCelular")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("telefonoCliente_telefonoCelular")).sendKeys("22222222222");
        driver.findElement(By.id("emailCliente_emailPersonal")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(" //button[@class='confirm']")).click();
        Thread.sleep(200);
        driver.findElement(By.id("cliente_codigoVerificacion")).sendKeys("11111");
        Thread.sleep(200);
        driver.findElement(By.id("telefonoCliente_telefonoCasa")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("telefonoCliente_telefonoCasa")).sendKeys("22222222222");
        Thread.sleep(200);

        choose.byText(By.id("cliente_fechaDeNacimiento_dia"), "2");
        choose.byText(By.id("cliente_fechaDeNacimiento_mes"), "Febrero");
        choose.byText(By.id("cliente_fechaDeNacimiento_anio"), "1971");
        choose.byText(By.id("cliente_genero"), "Hombre");
        choose.byText(By.id("cliente_nacionalidad"), "MEXICO");
        choose.byText(By.id("cliente_lugarDeNacimiento"), "AGUASCALIENTES");
        driver.findElement(By.id("siguiente")).click();


        // 2 - Vivienda

        driver.findElement(By.cssSelector(".row:nth-child(4) .form-group:nth-child(1)")).click();
        driver.findElement(By.id("direccionCliente_calle")).click();
        driver.findElement(By.id("direccionCliente_calle")).sendKeys("Montevideo 165");
        driver.findElement(By.id("direccionCliente_numeroExterior")).sendKeys("Montev");
        driver.findElement(By.id("direccionCliente_numeroInterior")).sendKeys("Montev");
        driver.findElement(By.id("direccionCliente_codigoPostal")).click();
        driver.findElement(By.id("direccionCliente_codigoPostal")).sendKeys("20263");
        Thread.sleep(1000);

        choose.byText(By.id("direccionCliente_colonia"), "Agua Clara");
        choose.byText(By.id("direccionCliente_estado"), "AGUASCALIENTES");
        choose.byText(By.id("direccionCliente_delegacion"), "Aguascalientes");

        //Antiguedad en la Vivienda
        choose.byText(By.name("direccionCliente_tiempoDeVivir_mes"), "Marzo");
        choose.byText(By.name("direccionCliente_tiempoDeVivir_anio"), "2022");

        //Antiguedad en la ciudad
        choose.byText(By.name("direccionCliente_tiempoDeResidencia_mes"), "Marzo");
        choose.byText(By.name("direccionCliente_tiempoDeResidencia_anio"), "2012");
        choose.byText(By.name("cliente_dependientesEconomicos"), "1");
        choose.byText(By.name("direccionCliente_horarioDeContacto"), "15 hrs a 18 hrs");
        choose.byText(By.name("direccionCliente_tipoDeVivienda"), "PROPIA");
        choose.byText(By.name("cliente_estadoCivil"), "SOLTERO");
        driver.findElement(By.id("siguiente")).click();

        // 3 - Empleo
        choose.byText(By.name("empleoCliente_profesion"), "ABOGADO");
        choose.byText(By.name("empleoCliente_ocupacion"), "ABOGADO");
//        write.byKeys(driver, "ABOGADO");
        driver.findElement(By.id("empleoCliente_empresa")).sendKeys("asdasd");
        choose.byText(By.id("empleoCliente_antiguedad"), "Abril");
        choose.byText(By.name("empleoCliente_antiguedad_anio"), "2014");
        driver.findElement(By.id("empleoCliente_ingresosFijos")).sendKeys("50000");
        driver.findElement(By.id("empleoCliente_ingresosVariables")).sendKeys("30000");
        driver.findElement(By.id("siguiente")).click();

        // 4 - Historial Crediticio
        driver.findElement(By.id("consultaTradicional")).click();
        driver.findElement(By.id("cadenaBuroTestTradicional")).click();
        driver.findElement(By.id("cadenaBuroTestTradicional")).sendKeys(Cadena.cadenaBuro);
        driver.findElement(By.cssSelector(".cbct-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='barraIconos']/div[12]/div[7]/div/button")).click();
        driver.findElement(By.xpath("//*[@id='continuarConsultaBCTrad']/button")).click();
        Thread.sleep(5000);

        // 5 - Ofertas
        driver.findElement(By.linkText("5 - Ofertas")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("5 - Ofertas")).click();
        //View
        driver.findElement(By.xpath("//*[@id='wrapper_bu']/div[2]/div/div/div[1]/div[6]/a")).click();
        //Aplicar
        js.executeScript("confirmarSeleccion(0,'8')");
//        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[5]/form/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/p")).click();
        //Si
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='barraIconos']/div[12]/div[7]/div/button")).click();
        Thread.sleep(10000);


        //Continuar
        js.executeScript("cerrarModalConfirmacion()");
//        driver.findElement(By.xpath("//*[@id='cerrarModalConfirmacion']")).click();
        Thread.sleep(5000);

        //6 / Datos Complementarios

        choose.byText(By.id("cliente_clasificacion"), "Compra de bienes");
        choose.byText(By.id("cliente_finalidad"), "Compra");
        choose.byText(By.id("cliente_uso"), "Personal");

        //Referencia 1
        driver.findElement(By.id("referenciaCliente_referencia1Nombre")).sendKeys("Néstor");
        driver.findElement(By.id("referenciaCliente_referencia1SegundoNombre")).sendKeys("Daniel");
        driver.findElement(By.id("referenciaCliente_referencia1ApellidoPaterno")).sendKeys("Flores");
        driver.findElement(By.id("referenciaCliente_referencia1ApellidoMaterno")).sendKeys("Alvarez");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCasa")).click();
        Thread.sleep(500);
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCasa")).sendKeys("22222222222");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCel")).click();
        Thread.sleep(500);
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCel")).sendKeys("22222222222");
        choose.byText(By.id("referenciaCliente_referencia1TipoDeReferencia"), "AMISTAD");
        choose.byText(By.id("referenciaCliente_referencia1AntiguedadDeRelacionMes"), "Marzo");
        choose.byText(By.id("referenciaCliente_referencia1AntiguedadDeRelacionAnio"), "2019");

        //Referencia 2
        driver.findElement(By.id("referenciaCliente_referencia2Nombre")).sendKeys("Néstor");
        driver.findElement(By.id("referenciaCliente_referencia2SegundoNombre")).sendKeys("Daniel");
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoPaterno")).sendKeys("Flores");
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoMaterno")).sendKeys("Alvarez");
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCasa")).click();
        Thread.sleep(500);
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCasa")).sendKeys("22222222222");
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCel")).click();
        Thread.sleep(500);
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCel")).sendKeys("22222222222");
        choose.byText(By.id("referenciaCliente_referencia2TipoDeReferencia"), "AMISTAD");
        choose.byText(By.id("referenciaCliente_referencia2AntiguedadDeRelacionMes"), "Marzo");
        choose.byText(By.id("referenciaCliente_referencia2AntiguedadDeRelacionAnio"), "2019");

        //Generales
        choose.byText(By.id("cliente_nivelEducativo"), "Secundaria");

        //Domicilio del Trabajo
        driver.findElement(By.id("empleoCliente_calle")).sendKeys("Avenida Siempre Viva");
        driver.findElement(By.id("empleoCliente_numeroExterior")).sendKeys("12322");
        driver.findElement(By.id("empleoCliente_codigoPostal")).sendKeys("20263");
        choose.byText ( By.id ( "empleoCliente_colonia" ), "Agua Clara" );
        choose.byText ( By.id ( "empleoCliente_estado" ), "AGUASCALIENTES" );
        choose.byText ( By.id ( "empleoCliente_delegacion" ), "Aguascalientes" );
        driver.findElement(By.id("empleoCliente_telefono")).click();
        Thread.sleep(500);
        driver.findElement(By.id("empleoCliente_telefono")).sendKeys("22222222222");
        choose.byText ( By.id ( "empleoCliente_delegacion" ), "Aguascalientes" );

        //Garantía Automotriz

        //Actividad económica
        driver.findElement(By.xpath ("//*[@id='empleoCliente_actividadEconomica_chosen']/a")).click();
        driver.findElement ( By.xpath ( "//*[@id='empleoCliente_actividadEconomica_chosen']/div/div/input" )).sendKeys ( "CULTIVO DE ALPISTE" );
        keyboard.enter ( driver );

        //Sector económico
        driver.findElement(By.xpath ("//*[@id='empleoCliente_sectorEconomico_chosen']/a")).click();
        driver.findElement ( By.xpath ( "//*[@id='empleoCliente_sectorEconomico_chosen']/div/div/input" )).sendKeys ( "AGRICULTURA" );
        keyboard.enter ( driver );
        choose.byText ( By.id ( "empleoCliente_periodicidadEmpleo" ), "Catorcenal" );


        //Garantía Automotriz
        choose.byText ( By.id ( "garantiaAutomotriz_anio" ), "2016" );
        choose.byText ( By.id ( "garantiaAutomotriz_marcaAutomovil" ), "ACURA" );
        choose.byText ( By.id ( "garantiaAutomotriz_modeloAutomovil" ), "TLX ADVANCE CA CE CD CQ CB PIEL AUT 6 Cil. 4 Pts. 2016" );
        driver.findElement(By.id("garantiaAutomotriz_numeroDeSerie")).sendKeys("234234");
        driver.findElement(By.id("garantiaAutomotriz_tarjetaDeCirculacion")).sendKeys("234234");
        driver.findElement(By.id("garantiaAutomotriz_tenencia")).sendKeys("34234");
        driver.findElement(By.id("garantiaAutomotriz_valorFactura")).sendKeys("23424");

        //Generales Beneficiario #1
        driver.findElement(By.id("beneficiario1_nombre")).sendKeys("Nestor");
        driver.findElement(By.id("beneficiario1_segundoNombre")).sendKeys("Daniel");
        driver.findElement(By.id("beneficiario1_apellidoPaterno")).sendKeys("Flores");
        driver.findElement(By.id("beneficiario1_codigoPostal")).sendKeys("20263");
        driver.findElement(By.id("beneficiario1_telefono")).click();
        Thread.sleep(500);
        driver.findElement(By.id("beneficiario1_telefono")).sendKeys("33333333333");
        driver.findElement(By.id("beneficiario1_apellidoMaterno")).sendKeys("Alvarez");
        driver.findElement(By.id("beneficiario1_calle")).sendKeys("Avenida Siempre");
        driver.findElement(By.id("beneficiario1_numeroExterior")).sendKeys("123123");
        driver.findElement(By.id("beneficiario1_numeroInterior")).sendKeys("123123");
        driver.findElement(By.id("beneficiario1_codigoPostal")).sendKeys("20263");
        choose.byText(By.id("beneficiario1_fechaDeNacimiento_dia"), "1");
        choose.byText(By.id("beneficiario1_fechaDeNacimiento_mes"), "Mayo");
        choose.byText(By.id("beneficiario1_fechaDeNacimiento_anio"), "1958");
        choose.byText(By.id("beneficiario1_estadoDeNacimiento"), "AGUASCALIENTES");
        choose.byText(By.id("beneficiario1_parentescoPregunta3"), "AMISTAD");
        choose.byText(By.id("selectSucursal"), "Sucursal 0003 - Hidalgo");
        Thread.sleep(2000);
        driver.findElement(By.id("siguiente")).click();

        // 7 - Carga Documentos


    }


}

