package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inserttry {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
        final String UPD_QUERY = "INSERT INTO stud(stud_id,stud_name) VALUES (?,?)";

        Connection conn = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(DB_URL, "user1", "user1");

            PreparedStatement prepstate = conn.prepareStatement(UPD_QUERY);
            prepstate.setInt(1, 2);
            prepstate.setString(2, "Abu");

            int rowsUpdated = prepstate.executeUpdate();

            if(rowsUpdated>0){
                System.out.println("A new student was inserted successfully");
            }
            conn.close();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
