package TestCase;


import Action.Choose;
import Action.Write;
import Config.BaseTest;
import Tools.Cadena;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class KsmsChallengeTest extends BaseTest {


    @Test
    public void Test() throws InterruptedException {
        Choose choose = new Choose(driver);
        Write write = new Write(driver);
        driver.get("http://ksms.mx/libertadqa/login/auth?format=");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tester");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Mexico.2081");
        driver.findElement(By.cssSelector(".loginButton")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) img")).click();
        driver.manage().window().setSize(new Dimension(1072, 1020));
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
        driver.manage().window().setSize(new Dimension(1072, 1020));
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
        Thread.sleep(5000);
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
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[5]/form/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/p")).click();
        //Si
        driver.findElement(By.xpath("//button[text()='Si']")).click();

        Thread.sleep(10000);
        //Continuar
        driver.findElement(By.xpath("//*[@id='cerrarModalConfirmacion']")).click();

        //6 / Datos Complementarios

        choose.byText(By.id("cliente_clasificacion"), "Compra de bienes");
        choose.byText(By.id("cliente_finalidad"), "Compra");
        choose.byText(By.id("cliente_uso"), "Personal");

        driver.findElement(By.id("referenciaCliente_referencia1SegundoNombre")).sendKeys("Néstor");
        driver.findElement(By.id("referenciaCliente_referencia1ApellidoPaterno")).sendKeys("Flores");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCasa")).sendKeys("22222222222");
        driver.findElement(By.cssSelector("fieldset:nth-child(1) > .form-group:nth-child(5)")).click();
        driver.findElement(By.id("referenciaCliente_referencia1ApellidoMaterno")).click();
        driver.findElement(By.id("referenciaCliente_referencia1ApellidoMaterno")).sendKeys("sdfdf");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCel")).click();
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCel")).sendKeys("22222222222");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCasa")).sendKeys("22222222222");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCel")).sendKeys("22222222222");
        driver.findElement(By.id("referenciaCliente_referencia1TelefonoCasa")).sendKeys("22222222222");

        choose.byText(By.id("referenciaCliente_referencia1TipoDeReferencia"), "AMISTAD");
        choose.byText(By.id("referenciaCliente_referencia1AntiguedadDeRelacionMes"), "Marzo");
        choose.byText(By.id("referenciaCliente_referencia1AntiguedadDeRelacionAnio"), "2019");


        driver.findElement(By.id("garantiaAutomotriz_numeroDeSerie")).click();
        driver.findElement(By.id("garantiaAutomotriz_numeroDeSerie")).sendKeys("234234");
        driver.findElement(By.id("garantiaAutomotriz_tarjetaDeCirculacion")).click();
        driver.findElement(By.id("garantiaAutomotriz_tarjetaDeCirculacion")).sendKeys("234234");
        driver.findElement(By.id("garantiaAutomotriz_tenencia")).click();
        driver.findElement(By.id("garantiaAutomotriz_tenencia")).sendKeys("34234");
        driver.findElement(By.id("garantiaAutomotriz_valorFactura")).click();
        driver.findElement(By.id("garantiaAutomotriz_valorFactura")).sendKeys("23424");
        driver.findElement(By.id("beneficiario1_nombre")).click();
        driver.findElement(By.id("beneficiario1_nombre")).sendKeys("werwerwer");
        driver.findElement(By.id("beneficiario1_segundoNombre")).click();
        driver.findElement(By.id("beneficiario1_segundoNombre")).sendKeys("Néstor");
        driver.findElement(By.id("beneficiario1_apellidoPaterno")).sendKeys("Flores");
        driver.findElement(By.id("beneficiario1_codigoPostal")).sendKeys("8300");
        driver.findElement(By.id("beneficiario1_telefono")).sendKeys("+5492994725555");
        driver.findElement(By.cssSelector(".apartado:nth-child(18) > .row:nth-child(5) .form-group:nth-child(1)")).click();
        driver.findElement(By.id("beneficiario1_apellidoMaterno")).click();
        driver.findElement(By.id("beneficiario1_apellidoMaterno")).sendKeys("wwerwer");
        driver.findElement(By.id("beneficiario1_calle")).click();
        driver.findElement(By.id("beneficiario1_calle")).sendKeys("werwer");
        driver.findElement(By.id("beneficiario1_numeroExterior")).click();
        driver.findElement(By.id("beneficiario1_numeroExterior")).sendKeys("123123");
        driver.findElement(By.id("beneficiario1_numeroInterior")).click();
        driver.findElement(By.id("beneficiario1_numeroInterior")).sendKeys("123123");
        driver.findElement(By.id("beneficiario1_codigoPostal")).sendKeys("20263");

        choose.byText(By.id("beneficiario1_fechaDeNacimiento_dia"), "1");
        choose.byText(By.id("beneficiario1_fechaDeNacimiento_mes"), "Mayo");
        choose.byText(By.id("beneficiario1_fechaDeNacimiento_anio"), "1958");
        choose.byText(By.cssSelector(".apartado:nth-child(18) > .row:nth-child(8) .form-group:nth-child(1)"), "AGUASCALIENTES");
        choose.byText(By.id("beneficiario1_parentescoPregunta3"), "AMISTAD");
        choose.byText(By.id("selectSucursal"), "Sucursal 0003 - Hidalgo");
        driver.findElement(By.cssSelector(".center:nth-child(25)")).click();
        driver.findElement(By.id("siguiente")).click();

        // 7
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(2) > .input-error")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(2) > .input-error")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(2)")).click();
        driver.findElement(By.id("referenciaCliente_referencia2Nombre")).click();
        driver.findElement(By.id("referenciaCliente_referencia2Nombre")).sendKeys("sdfsdf");
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(4) > .input-error")).click();
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoPaterno")).click();
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoPaterno")).sendKeys("asdasd");
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(5) > .input-error")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(5) > .input-error")).click();
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoMaterno")).click();
        driver.findElement(By.id("referenciaCliente_referencia2ApellidoMaterno")).sendKeys("asdad");
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCasa")).click();
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCasa")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(7) > .input-error")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(7) > .input-error")).click();
        driver.findElement(By.id("referenciaCliente_referencia2TelefonoCel")).click();
        driver.findElement(By.id("referenciaCliente_referencia2TipoDeReferencia")).click();
        {
            WebElement dropdown = driver.findElement(By.id("referenciaCliente_referencia2TipoDeReferencia"));
            dropdown.findElement(By.xpath("//option[. = 'AMISTAD']")).click();
        }
        driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionMes")).click();
        {
            WebElement dropdown = driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionMes"));
            dropdown.findElement(By.xpath("//option[. = 'Febrero']")).click();
        }
        driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionAnio")).click();
        {
            WebElement dropdown = driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionAnio"));
            dropdown.findElement(By.xpath("//option[. = '2019']")).click();
        }
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .title-section")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .title-section")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(9)")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(9)")).click();
        driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionMes")).click();
        {
            WebElement dropdown = driver.findElement(By.id("referenciaCliente_referencia2AntiguedadDeRelacionMes"));
            dropdown.findElement(By.xpath("//option[. = 'Junio']")).click();
        }
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .title-section")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .title-section")).click();
        driver.findElement(By.id("content-paso-6")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .form-group:nth-child(9)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .title-section")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .row > .col-xs-12")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14)")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) > .row > .col-xs-12")).click();
        driver.findElement(By.cssSelector(".apartado:nth-child(14) .input-error")).click();
        driver.findElement(By.id("cliente_nivelEducativo")).click();
        {
            WebElement dropdown = driver.findElement(By.id("cliente_nivelEducativo"));
            dropdown.findElement(By.xpath("//option[. = 'Secundaria']")).click();
        }
        driver.findElement(By.cssSelector(".apartado:nth-child(15) > .row:nth-child(4) .form-group:nth-child(1) > .input-error")).click();
        driver.findElement(By.id("empleoCliente_calle")).click();
        driver.findElement(By.id("empleoCliente_calle")).sendKeys("aerwerwer");
        driver.findElement(By.id("empleoCliente_numeroExterior")).click();
        driver.findElement(By.id("empleoCliente_numeroExterior")).sendKeys("werwer");
        driver.findElement(By.id("empleoCliente_numeroExterior")).click();
        driver.findElement(By.id("empleoCliente_numeroExterior")).click();
        {
            WebElement element = driver.findElement(By.id("empleoCliente_numeroExterior"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("empleoCliente_numeroExterior")).sendKeys("34234234");
        driver.findElement(By.id("empleoCliente_codigoPostal")).click();
        driver.findElement(By.id("empleoCliente_codigoPostal")).click();
        driver.findElement(By.id("barraIconos")).click();
        driver.findElement(By.id("empleoCliente_codigoPostal")).sendKeys("20263");
        driver.findElement(By.id("empleoCliente_colonia")).click();
        driver.findElement(By.id("empleoCliente_estado")).click();
        driver.findElement(By.id("empleoCliente_estado")).click();
        driver.findElement(By.id("empleoCliente_delegacion")).click();
        driver.findElement(By.id("empleoCliente_telefono")).click();
        driver.findElement(By.id("empleoCliente_telefono")).click();
        driver.findElement(By.cssSelector("#empleoCliente_actividadEconomica_chosen span")).click();
        driver.findElement(By.cssSelector(".active-result:nth-child(2)")).click();
        js.executeScript("window.scrollTo(0,1792)");
        driver.findElement(By.cssSelector("#empleoCliente_sectorEconomico_chosen span")).click();
        driver.findElement(By.cssSelector("#empleoCliente_sectorEconomico_chosen .active-result:nth-child(2)")).click();
        driver.findElement(By.id("empleoCliente_extension")).click();
        driver.findElement(By.cssSelector(".row:nth-child(7) .form-group:nth-child(3) > .input-error")).click();
        driver.findElement(By.id("empleoCliente_periodicidadEmpleo")).click();
        {
            WebElement dropdown = driver.findElement(By.id("empleoCliente_periodicidadEmpleo"));
            dropdown.findElement(By.xpath("//option[. = 'Catorcenal']")).click();
        }
        driver.findElement(By.id("empleoCliente_numeroDeSeguroSocial")).click();
        driver.findElement(By.id("siguiente")).click();
        js.executeScript("window.scrollTo(0,4351)");
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.id("btn-sms-docs")).click();
        driver.findElement(By.cssSelector(".confirm")).click();
        driver.findElement(By.id("tipoDeDocumento")).click();
        driver.findElement(By.cssSelector(".col-md-12:nth-child(8)")).click();
        driver.findElement(By.cssSelector("#idDropzone > .dz-message")).click();
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#idDropzone > .dz-message")).click();
//        vars.put("win8761", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8761").toString());
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        driver.findElement(By.id("terminarSolicitud")).click();
    }


}

