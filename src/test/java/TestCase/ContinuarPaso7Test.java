package TestCase;


import Action.Choose;
import Action.Keyboard;
import Action.Write;
import Config.BaseTest;
import Tools.Cadena;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;


public class ContinuarPaso7Test extends BaseTest {


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

        // continuar caso donde deje
        //xivNLRu
        driver.findElement(By.id("valorBusqueda")).sendKeys("xivNLRu");
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search']")).click();
        Thread.sleep ( 2000 );
        driver.findElement(By.linkText("Ver Detalle")).click();
        Thread.sleep ( 4000 );
        driver.findElement(By.linkText("Continuar solicitud")).click();

        //Identificación Oficial *(Debes Subir el Anverso y Reverso de la Identificación Oficial)
        driver.findElement(By.xpath("(//div[@data-dztype='identificacionOficial']//div)[1]")).click();

        //Comprobante de domicilio
        driver.findElement(By.xpath("(//div[@data-dztype='comprobanteDeDomicilio']//div)[1]")).click();

        //Comprobante de ingresos *(Debes Subir 6 Comprobantes de Ingresos)
        driver.findElement(By.xpath("//div[@data-dztype='asalariado']")).click();

        //Garantía Automotriz
        driver.findElement(By.xpath("//div[@data-dztype='garantiasVehiculares']")).click();

        //Solicitud de crédito
        driver.findElement(By.xpath("(//div[@data-dztype='solicitudDeCredito']//div)[1]")).click();

        //Fin
        //Siguiente
        driver.findElement(By.linkText("Siguiente")).click();


        // 7 - Carga Documentos




    }


}

