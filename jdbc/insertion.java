import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

class StudentExample {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "nishant_1078",
                    "1021");
            Statement st = con.createStatement();
            String insertQuery = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, 5);
            ps.setString(2, "Venya");
            ps.setInt(3, 90);
            ps.executeUpdate();
            ps.setInt(1, 2);
            ps.setString(2, "Nishant");
            ps.setInt(3, 80);
            ps.executeUpdate();
            ps.setInt(1, 4);
            ps.setString(2, "Kathan");
            ps.setInt(3, 75);
            ps.executeUpdate();
            System.out.println("Record inserted successfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
