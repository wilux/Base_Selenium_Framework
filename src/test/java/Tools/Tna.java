package Tools;


public class Tna {

    public double getTnaEntrevista(String modulo, String top, String nroEntrevista) {
        double tna = 0;
        SQLDatabaseConnection bd = new SQLDatabaseConnection ();


        String sql = " select Tatasa  from FSR025 \n" +
                "                    Where Pgcod = 1\n" +
                "                    and  Tamod = " + modulo + "\n" +
                "                    and  Tpizar = (\n" +
                "\t\t\t\t\tselect Pp028DefN from FPP028\n" +
                "                Where Pp010Prd = 1 \n" +
                "                and  Pp017Par = 17\n" +
                "                and  Pp028Emp = 1\n" +
                "                and  Pp028Mod = " + modulo + "\n" +
                "                and  Pp028Top = " + top + ")\n" +
                "                    and  Tamda = 80\n" +
                "                    and  Tapap = 0\t\n" +
                "                    and  Tafdes = (\n" +
                "\t\t\t\t\tselect top 1 tafdes from FSD025                     \n" +
                "\t\t\t\t\tWhere Pgcod=1\n" +
                "                    and Tamod = " + modulo + "\n" +
                "                    and Tpizar = (select Pp028DefN from FPP028\n" +
                "                Where Pp010Prd = 1 \n" +
                "                and  Pp017Par = 17 \n" +
                "                and  Pp028Emp = 1 \n" +
                "                and  Pp028Mod = " + modulo + "\n" +
                "                and  Pp028Top = " + top + ")\n" +
                "                    and Tamda = 80\t\n" +
                "                    and Tapap = 0\t\n" +
                "                    and tafdes <= (select bnqfpa2fch from bnqfpa2 where bnqfpa2nro = " + nroEntrevista + ")\n" +
                "                    order by tafdes desc\n" +
                ")and  Tamto = 99999999.00";

        tna = Double.parseDouble ( bd.getValue ( sql ) );

        return tna;
    }
}
