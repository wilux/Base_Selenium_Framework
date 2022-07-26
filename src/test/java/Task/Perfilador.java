package Task;

import Config.Acciones;
import Page.PerfiladorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Perfilador {
    WebDriver driver;


    public Perfilador(WebDriver driver) {

        this.driver = driver;
    }


    public void clienteLibertad(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        if (value.contains("Si") == true) {
            driver.findElement(perfiladorPage.buttonSi).click();
        } else {
            driver.findElement(perfiladorPage.buttonNo).click();
        }

    }


    public void tipoIngresosPerfilador(String tipo) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.SelectTipoDocumento, tipo);

    }

    public void avanzarPerfilador() {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.buttonAvanzarPerfilador).click();

    }

    public void nombre(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputNombre).sendKeys(value);

    }

    public void segundoNombre(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputSegundoNombre).sendKeys(value);

    }

    public void apellidoPaterno(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputApellidoPaterno).sendKeys(value);

    }

    public void apellidoMaterno(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputApellidoMaterno).sendKeys(value);

    }

    public void correoElectronico(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputCorreo).sendKeys(value);

    }

    public void telefonoCelular(String value) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);

        driver.findElement(perfiladorPage.inputTelefonoCelular).click();
        Thread.sleep(1000);
        driver.findElement(perfiladorPage.inputTelefonoCelular).sendKeys(value);
        Thread.sleep(1000);
        driver.findElement(perfiladorPage.inputCorreo).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(perfiladorPage.popUpbuttonOk));
        firstResult.click();

    }

    public void codigoVerficacion(String value) {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.inputCodigoVerificacion).sendKeys(value);
    }

    public void telefonoCasa(String value) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);

        driver.findElement(perfiladorPage.inputTelefonoCasa).click();
        Thread.sleep(1000);
        driver.findElement(perfiladorPage.inputTelefonoCasa).sendKeys(value);
        Thread.sleep(1000);

    }

    public void fechaNacimiento(String dd, String mm, String yyyy) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.selectDia, dd);
        acciones.choose().byText(perfiladorPage.selectMes, mm);
        acciones.choose().byText(perfiladorPage.selectAnio, yyyy);
    }

    public void sexo(String value) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.selectSexo, value);

    }

    public void nacionalidad(String value) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.selectNacionalidad, value);

    }

    public void estadoNacimiento(String value) throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        Acciones acciones = new Acciones(driver);
        acciones.choose().byText(perfiladorPage.selectEstadoNacimiento, value);

    }


//    public void (String value) throws InterruptedException {
//        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
//        Acciones acciones = new Acciones(driver);
//        acciones.choose().byText(perfiladorPage.selectEstadoNacimiento, value);
//
//    }

    public boolean siguiente() throws InterruptedException {
        PerfiladorPage perfiladorPage = new PerfiladorPage(driver);
        driver.findElement(perfiladorPage.buttonSiguiente).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(perfiladorPage.msgBoxOk));

        return firstResult.isDisplayed();

    }


}
