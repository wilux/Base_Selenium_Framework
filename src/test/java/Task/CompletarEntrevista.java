package Task;

import Action.Choose;
import Action.Click;
import Action.Get;
import Action.Write;
import Page.EntrevistaPage;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CompletarEntrevista {
    WebDriver driver;

    public CompletarEntrevista(WebDriver driver) {

        this.driver = driver;

    }

    public void IdentificacionPersona(String tipo, String cuilCuit) throws InterruptedException {
        System.out.println("Ingresando Entrevista para el Documento "+cuilCuit);
        //Ingresar Tipo y Documento
        EntrevistaPage entrevistaPage = new EntrevistaPage(driver);
        Choose choose = new Choose(driver);
        Click click = new Click(driver);
        Write write = new Write(driver);
        choose.byText(entrevistaPage.SelectTipo, tipo);
        write.On(entrevistaPage.InputDocumento, cuilCuit);
        click.On(entrevistaPage.BTNOPVALIDAR);

    }
    public void Modalidad(String modalidad){
        System.out.println("Completando Modalidad");
        EntrevistaPage entrevistaPage = new EntrevistaPage(driver);

        Choose choose = new Choose(driver);
        choose.byText(entrevistaPage.SelectModalidad,modalidad);

    }

    public void DatosPersonales() {

        System.out.println("Completando Datos Personales");
        EntrevistaPage entrevistaPage = new EntrevistaPage(driver);

        Choose choose = new Choose(driver);
        choose.byValue(entrevistaPage.SelectSexo, "M");

//        Click click = new Click(driver);
//        Write write = new Write(driver);
//        Get get = new Get(driver);
//        final Stopwatch stopwatch = Stopwatch.createStarted();
//        do {
//              if (get.ValueOnInput(entrevistaPage.InputNombre)!="") {
//
//
//                //Valores Genericos
//                String apellido = "Doe";
//                String nombre = "John";
//                String fechaNacimiento = "01011990";
//                String capacidadLegal = "1";//"MAYOR DE EDAD"
//                String sexo = "M";
//                String paisNacimiento = "80"; //Argentina
//                String estadoCivil = "4";//Soltero
//                String provincia = "15"; //Neuquen
//                String localidad = "326";//Neuquen
//                String paisCiudadania = "80"; //Argentina
//
//                //Si es vacio completo con generico si no dejo como está
////  if (get.ValueOnInput(InputApellido)==""){write.On(InputApellido, apellido);}
////  if (get.ValueOnInput(InputNombre)==""){write.On(InputNombre, nombre);}
////  if (get.ValueOnInput(InputFechaNac)=="/  /"){write.On(InputFechaNac, fechaNacimiento);}
////  if (get.ValueOnInput(SelectCapacidadLegal)=="0"){choose.byValue(SelectCapacidadLegal, capacidadLegal);}
//                  System.out.println(get.ValueOnInput(entrevistaPage.SelectSexo));
//                if (get.ValueOnInput(entrevistaPage.SelectSexo) == "") {
//                    choose.byValue(entrevistaPage.SelectSexo, sexo);
//                }
////  if (get.ValueOnInput(SelectPaisNacimiento)=="0"){choose.byValue(SelectPaisNacimiento, paisNacimiento);}
////  if (get.ValueOnInput(SelectEstadoCivil)==""){choose.byValue(SelectEstadoCivil, estadoCivil);}
////  if (get.ValueOnInput(SelectProvincia)=="0"){choose.byValue(SelectProvincia, provincia);}
////  if (get.ValueOnInput(InputLocalidad)=="0"){write.On(InputLocalidad, localidad);}
////  if (get.ValueOnInput(SelectPaisCiudadania)==""){choose.byValue(SelectPaisCiudadania, paisCiudadania);}
//                break;
//            }else{continue;}
//
//        }while (get.ValueOnInput(entrevistaPage.SelectCapacidadLegal)!=null);
    }
}
