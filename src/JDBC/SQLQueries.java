package JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SQLQueries {

    public static void main(String[] args){
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
        final String SQL_QUERY = "SELECT * FROM INVOICE";

        // Use try to connect to and query database
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(DB_URL, "user1", "user1");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_QUERY);

            // get Result Meta Data 
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumn = metaData.getColumnCount();
            
            System.out.println("Invoices of Products: \n\n");

            // display the names of the columns in the ResultSet
            for(int i = 1;i<=numberOfColumn;i++){
                System.out.printf("%-8s\t",metaData.getColumnName(i));
            }

            System.out.println();

            // display query results
            while(resultSet.next()){
                for(int i =1;i<=numberOfColumn;i++){
                    System.out.printf("%-8s\t",resultSet.getObject(i));
                }
                System.out.println();
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
