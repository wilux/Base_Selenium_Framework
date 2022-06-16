package Tools;


import Config.Credenciales;

import java.sql.*;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public void select(String sql) {


        String connectionUrl = "jdbc:sqlserver://arcncd07;databaseName=BPN_WEB_QA;encrypt=true;integratedSecurity=true;authenticationScheme=nativeAuthentication;trustServerCertificate=true;trustStore= C:\\Program Files\\Java\\jdk1.8.0_251\\lib\\security\\cacert;trustStorePassword=changeit";
        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            resultSet = statement.executeQuery(sql);


            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public int update(String sql) {


        String connectionUrl = "jdbc:sqlserver://arcncd07;databaseName=BPN_WEB_QA;encrypt=true;integratedSecurity=true;authenticationScheme=nativeAuthentication;trustServerCertificate=true;trustStore= C:\\Program Files\\Java\\jdk1.8.0_251\\lib\\security\\cacert;trustStorePassword=changeit";
        int result =0;
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {
             result = statement.executeUpdate(sql);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public  void CambiarUsuario(String usuario)
    {
        Credenciales credenciales = new Credenciales();
        String sql = "UPDATE J055XZ SET J055XZUsr='"+usuario+"'"+" WHERE J055XZUad='"+credenciales.username+"'";
        if (update(sql)<0) {
            System.out.println("Cambio no efectuado");
        }else{
            System.out.println("Cambio realizado");
        }
        }
    }

