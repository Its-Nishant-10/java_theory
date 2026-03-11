import java.sql.*;

public class SqlTest {
    public static void main(String[] args) {
        // Connection details for Oracle 11g Express Edition
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "system"; // Default user for XE
        String pass = "1021";

        try {
            // Updated Driver Class Name (preferred since Oracle 10g)
            Class.forName("oracle.jdbc.OracleDriver");

            // try-with-resources ensures all objects close automatically
            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT 'Connected to ' || instance_name FROM v$instance")) {

                System.out.println("Connection Successful!");
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found! Check your classpath: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
