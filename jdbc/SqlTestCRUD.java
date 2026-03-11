import java.sql.*;

public class SqlTestCRUD {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "system";
        String pass = "1021";

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            try (Connection conn = DriverManager.getConnection(url, user, pass); Statement stmt = conn.createStatement()) {

                System.out.println("Connected to Database!");

                // 1️⃣ Create Table
                String createTable = "CREATE TABLE student_test (" + "id NUMBER PRIMARY KEY, " + "name VARCHAR2(50), " + "age NUMBER)";
                stmt.executeUpdate(createTable);
                System.out.println("Table created successfully!");

                // 2️⃣ Insert Data
                String insert1 = "INSERT INTO student_test VALUES (1, 'Rahul', 20)";
                String insert2 = "INSERT INTO student_test VALUES (2, 'Priya', 22)";

                stmt.executeUpdate(insert1);
                stmt.executeUpdate(insert2);

                System.out.println("Data inserted!");

                // 3️⃣ Fetch Data
                String selectQuery = "SELECT * FROM student_test";
                ResultSet rs = stmt.executeQuery(selectQuery);

                System.out.println("\nTable Data:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");

                    System.out.println(id + " | " + name + " | " + age);
                }

            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
