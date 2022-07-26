package Tools;


import java.sql.*;
import java.util.*;


public class SQLDatabaseConnection {

    String connectionUrl = "jdbc:sqlserver://arcncd07;databaseName=BPN_WEB_QA;encrypt=true;integratedSecurity=true;authenticationScheme=nativeAuthentication;trustServerCertificate=true;trustStore= C:\\Program Files\\Java\\jdk1.8.0_251\\lib\\security\\cacert;trustStorePassword=changeit";


    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public void select(String sql) {


        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection ( connectionUrl );
             Statement statement = connection.createStatement ();) {

            // Create and execute a SELECT SQL statement.
            resultSet = statement.executeQuery ( sql );


            // Print results from select statement
            while (resultSet.next ()) {
                System.out.println ( resultSet.getString ( 2 ) + " " + resultSet.getString ( 3 ) );
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }



    public String getValue(String sql) {


        ResultSet resultSet = null;
        String value = "";

        try (Connection connection = DriverManager.getConnection ( connectionUrl );
             Statement statement = connection.createStatement ();) {

            // Create and execute a SELECT SQL statement.
            resultSet = statement.executeQuery ( sql );


            // Print results from select statement
            while (resultSet.next ()) {
                value = resultSet.getString ( 1 );
            }
        } catch (SQLException e) {
//            e.printStackTrace ();
            System.out.println ( "No hay registros en la consulta" );
        }
        return value;
    }

    public List<String> getValues(String sql) {


        ResultSet resultSet = null;
        List value = new ArrayList<> ();

        try (Connection connection = DriverManager.getConnection ( connectionUrl );
             Statement statement = connection.createStatement ();) {

            // Create and execute a SELECT SQL statement.
            resultSet = statement.executeQuery ( sql );
            ResultSetMetaData rsmd = resultSet.getMetaData ();
            int columnCount = rsmd.getColumnCount ();

            value = new ArrayList<> ( columnCount );

            // Print results from select statement
            while (resultSet.next ()) {

                int i = 1;
                while (i <= columnCount) {
                    value.add ( resultSet.getString ( i++ ) );
                }
            }
        } catch (SQLException ex) {
//            ex.printStackTrace ();
            System.out.println ( "No hay registros en la consulta" );
        }
        return value;
    }

    public int update(String sql) {


        int result = 0;
        try (Connection connection = DriverManager.getConnection ( connectionUrl );
             Statement statement = connection.createStatement ();) {
            result = statement.executeUpdate ( sql );

        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return result;
    }




    public boolean hasColumn(String tabla, String columnName) throws SQLException {


        String connectionUrl = "jdbc:sqlserver://arcncd07;databaseName=BPN_WEB_QA;encrypt=true;integratedSecurity=true;authenticationScheme=nativeAuthentication;trustServerCertificate=true;trustStore= C:\\Program Files\\Java\\jdk1.8.0_251\\lib\\security\\cacert;trustStorePassword=changeit";
        ResultSet resultSet = null;

        Connection connection = DriverManager.getConnection ( connectionUrl );
        Statement statement = connection.createStatement ();

        // Create and execute a SELECT SQL statement.
        resultSet = statement.executeQuery ( "select top 1 * from " + tabla );

        ResultSetMetaData rsmd = resultSet.getMetaData ();
        int columns = rsmd.getColumnCount ();

        for (int x = 1; x <= columns; x++) {
            if ( columnName.equals ( rsmd.getColumnName ( x ) ) ) {
                return true;
            }
        }
        return false;
    }



}

