
import java.sql.*;

public class connectDatabase {
    public static void main(String[] args) throws Exception {
        // Connecting to the server
        String connectionURL = "jdbc:mysql://localhost:3306/mart";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(connectionURL);

        // Use the connection object for executing SQL statements
        // ...

        // Remember to close the connection when done
        conn.close();
    }
}
