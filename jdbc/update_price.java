import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class UpdateProduct {
    public static void main(String args[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "nishant_1078",
                    "1021");

            String query = "UPDATE product SET price=? WHERE product_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 65000); // new price
            ps.setInt(2, 1);     // product id

            ps.executeUpdate();

            System.out.println("Product price updated");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
