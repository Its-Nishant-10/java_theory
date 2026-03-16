import java.sql.*;

class DeleteProduct {
    public static void main(String args[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "nishant_1078",
                    "1021");

            String query = "DELETE FROM product WHERE product_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 2); // product to delete

            ps.executeUpdate();

            System.out.println("Product deleted");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
