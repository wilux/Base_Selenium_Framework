package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CargandoPage {
    public By frameMsg = By.xpath ( "//IFRAME[]" );
    WebDriver driver;


//<TABLE style="POSITION: absolute" cellSpacing=3 cellPadding=0 width=502 bgColor=#888888><TBODY>
//<TR>
//<TD>
//<TABLE cellSpacing=0 cellPadding=0 bgColor=#ffffff>
//<TBODY>
//<TR height=65>
//<TD width=21></TD>
//<TD><FONT color=#969696 size=5 face=Verdana>Procesando, por favor espere...</FONT> </TD>
//<TD width=16></TD>
//<TD vAlign=middle>
//<TABLE cellSpacing=0 cellPadding=0>
//<TBODY>
//<TR>
//<TD height=18></TD></TR>
//<TR vAlign=middle>
//<TD><IMG src="http://btwebqa.ar.bpn:98/BTWeb/images/wait.gif"></IMG> </TD></TR>
//<TR>
//<TD height=14></TD></TR></TBODY></TABLE></TD>
//<TD width=18></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE>


//    <IFRAME onload="this.style.width = this.parentElement.childNodes[0].clientWidth; this.style.height = this.parentElement.childNodes[0].clientHeight" style="HEIGHT: 105px; WIDTH: 502px" height=10 src="javascript:''" width=10></IFRAME>

    public CargandoPage(WebDriver driver) {

        this.driver = driver;

    }


}


