package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class MenuPage
{
    WebDriver driver;

    By Logo = By.id("logo");
    //Menu General
    By Menu = By.id("menuBase");
    //Acceso
    By Accesos = By.xpath("//a[@init='m0_1']");
    //Acceso -> Ejecutar
    By MenuEjecutar = By.xpath("//a[@class='leafCompementWithShortcut']");
    //Inicio
    By Inicio = By.xpath("//a[@init='m0_0']");
    //Inicio -> WorkFlow
    By WF = By.xpath("//a[@init='m1_0']");
    //Inicio -> WorkFlow -> BANDEJA DE TAREAS
    By BandejaTareas = By.xpath("//a[.='BANDEJA DE TAREAS']");

    By _PROGRAMA = By.id("_PROGRAMA");
    By BTNOPCONFIRMAR = By.id("BTNOPCONFIRMAR");
    

    public MenuPage(WebDriver driver){

        this.driver = driver;

    }



    public void Ejecutar() throws InterruptedException {



            try {

                driver.findElement(Accesos).click();
                Thread.sleep(200);
                driver.findElement(MenuEjecutar).click();


            } catch (Exception e) {
                System.out.println("No se encontro elemento "+e.getMessage());

            }


    }



}


