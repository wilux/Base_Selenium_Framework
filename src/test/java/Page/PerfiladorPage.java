package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PerfiladorPage {

    //Panel
    public By buttonNo = By.xpath("//input[@id='clienteNo']");
    public By buttonSi = By.xpath("//input[@id='clienteSi']");
    public By SelectTipoDocumento = By.xpath("//select[@id='tipoDeDocumento']");
    public By buttonAvanzarPerfilador = By.xpath("//input[@id='avanzarPerfilador']");
    public By buttonSiguiente = By.xpath("//button[@id='siguiente']");

    public By msgBoxOk = By.xpath("//p[contains(.,'El folio de tu solicitud es')]");


    // 1 - DatosPersonales
    public By inputNombre = By.xpath("//input[@id='cliente_nombre']");
    public By inputSegundoNombre = By.xpath("//input[@id='cliente_segundoNombre']");
    public By inputApellidoPaterno = By.xpath("//input[@id='cliente_apellidoPaterno']");
    public By inputApellidoMaterno = By.xpath("//input[@id='cliente_apellidoMaterno']");
    public By inputCorreo = By.xpath("//input[@id='emailCliente_emailPersonal']");
    public By inputTelefonoCelular = By.xpath("//input[@id='telefonoCliente_telefonoCelular']");
    public By inputCodigoVerificacion = By.xpath("//input[@id='cliente_codigoVerificacion']");
    public By inputTelefonoCasa = By.xpath("//input[@id='telefonoCliente_telefonoCasa']");
    public By selectDia = By.xpath("//select[@id='cliente_fechaDeNacimiento_dia']");
    public By selectMes = By.xpath("//select[@id='cliente_fechaDeNacimiento_mes']");
    public By selectAnio = By.xpath("//select[@id='cliente_fechaDeNacimiento_anio']");
    public By selectSexo = By.xpath("//select[@id='cliente_genero']");
    public By selectNacionalidad = By.xpath("//select[@id='cliente_nacionalidad']");
    public By selectEstadoNacimiento = By.xpath("//select[@id='cliente_lugarDeNacimiento']");


    // 2 - Vivinda
    public By inputCalle = By.id("direccionCliente_calle");

    public By inputNumeroExterior = By.id("direccionCliente_numeroExterior");

    public By inputCodigoPostal = By.id("direccionCliente_codigoPostal");

    public By selectColonia = By.id("direccionCliente_colonia");

    public By selectEstado = By.id("direccionCliente_estado");

    public By selectDelegacion = By.id("direccionCliente_delegacion");

    public By selectMesAntiguedadVivienda = By.name("direccionCliente_tiempoDeVivir_mes");
    public By selectAnioAntiguedadVivienda = By.name("direccionCliente_tiempoDeVivir_anio");

    public By selectMesAntiguedadCiudad = By.name("direccionCliente_tiempoDeResidencia_mes");
    public By selectAnioAntiguedadCiudad = By.name("direccionCliente_tiempoDeResidencia_anio");

    public By selectDependienteEconomicos = By.id("cliente_dependientesEconomicos");
    public By selectHorarioContacto = By.id("direccionCliente_horarioDeContacto");

    public By selectTipoVivienda = By.id("direccionCliente_tipoDeVivienda");

    public By selectEstadoCivil = By.id("cliente_estadoCivil");

    // 3 - Empleo
    public By selectInputProfesion = By.xpath("//input[@id='empleoCliente_profesion_chosen");
    public By selectInputOcupacion = By.xpath("//input[@id='empleoCliente_ocupacion_chosen");
    public By inputNombrEmpresa = By.xpath("//input[@id='empleoCliente_empresa");

    public By selectMesEmpleoAntiguedad = By.name("empleoCliente_antiguedad_mes");
    public By selectAnioEmpleoAntiguedad = By.name("empleoCliente_antiguedad_anio");

    public By inputIngresosFijos = By.id("empleoCliente_ingresosFijos");
    public By inputIngresosVariables = By.id("empleoCliente_ingresosVariables");


    // 4 - Historial Crediticio
    public By buttonConsultaTradicional = By.xpath("//button[@id='consultaTradicional']");
    public By inputCadenaBuro = By.xpath("//input[@id='cadenaBuroTestTradicional");
    public By buttonVerificar = By.cssSelector("#consulta-tradicional > div:nth-child(4) > div.center.col-xs-12.scrollmenu > button");


    //PopUp SMS
    public By popUpSmsOk = By.xpath("//h2[.='SMS Enviado']");
    public By popUpbuttonOk = By.xpath(" //button[@class='confirm']");


    WebDriver driver;

    public PerfiladorPage(WebDriver driver) {

        this.driver = driver;

    }

}


