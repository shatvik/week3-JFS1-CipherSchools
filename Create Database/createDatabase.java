import java.sql.*;

public class createDatabase {
    public static void main(String[] args) throws Exception {
        // Connecting to the MySQL server
        String connectionURL = "jdbc:mysql://localhost/booksdb";
        String username = "root";
        String password = "<passwordhere>";

        Connection conn = DriverManager.getConnection(connectionURL, username, password);

        // Fetching Data from MySQL Server
        Statement stmt = conn.createStatement();

        String selectQuery = "SELECT * FROM books";
        ResultSet result = stmt.executeQuery(selectQuery);

        while (result.next()) {
            System.out.println(result.getString("column_name")); // Replace "column_name" with the actual column name
                                                                 // from the "books" table
        }

        // Close the result set, statement, and connection
        result.close();
        stmt.close();
        conn.close();
    }
}