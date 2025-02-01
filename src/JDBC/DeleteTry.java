package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DeleteTry {
    public static void main(String[] args) {
        
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
        final String UPD_QUERY = "DELETE FROM stud WHERE stud_id=?";
        
        Connection conn = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(DB_URL, "user1", "user1");

            PreparedStatement prepstate = conn.prepareStatement(UPD_QUERY);
            prepstate.setInt(1, 1);

            int rowsUpdated = prepstate.executeUpdate();

            if(rowsUpdated>0){
                System.out.println("A student has been deleted successfully");
            }
            conn.close();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
