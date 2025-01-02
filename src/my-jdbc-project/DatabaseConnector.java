import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase"; // Database name 'mydatabase'
    private static final String USER = "user1"; // Default MySQL user 'root'
    private static final String PASSWORD = "user1"; // Your MySQL password

    public static Connection connect() {
        try {
            // Create a connection to the database
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Handle any connection errors
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static void main(String[] args) throws SQLException {
        // Connect to the database
        try (Connection connection = connect()) {
            if (connection != null) {
                System.out.println("Connected to the MySQL database successfully!");
            }
        } catch (RuntimeException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
