import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:expense.db";
    
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void createUsersTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
               + "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
               + "    username TEXT NOT NULL UNIQUE,\n"
               + "    email TEXT NOT NULL,\n"
               + "    created_at DATETIME DEFAULT CURRENT_TIMESTAMP\n"
               + ")";

        
    }
    
    public static void main(String[] args) {
        connect();
    }
}