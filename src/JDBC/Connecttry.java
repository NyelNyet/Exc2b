package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecttry {
    public static void main(String[] args){

        Connection connection = null;

        try{
            // Registering Oracle Driver Class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Getting Connection
            connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "user1",
                "user1");

            // Test If Connection Is NULL Or Not
            if(connection != null){
                System.out.println("Connection established successfully!");
            }else{
                System.out.println("No Connection!");
            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();

        }catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            try{

                if(connection != null){
                    connection.close();
                }

            }catch(SQLException e){
                    e.printStackTrace();

                }
        }
    }
}
