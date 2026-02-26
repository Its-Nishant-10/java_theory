import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class OracleJdbcTest {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 1. Load the Oracle Driver (crucial for ojdbc6)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Oracle Connection Details
            // Format: jdbc:oracle:thin:@<host>:<port>:<SID>
            // For Express Edition (XE), SID is usually "xe" and port is 1521
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system"; // Default admin user for Oracle XE
            String password = "1021";

            System.out.println("Connecting to Oracle Database...");
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null && !connection.isClosed()) {
                System.out.println("Success! Connected to Oracle 11g XE.");

                // Optional: Check validity with a 5-second timeout
                if (connection.isValid(5)) {
                    System.out.println("Connection is valid and active.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found! Add ojdbc6.jar to your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check if Oracle Service is running.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
