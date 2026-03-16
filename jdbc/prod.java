import java.sql.*;

class ProductProgram {
    public static void main(String args[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "nishant_1078",
                    "1021");

            Statement st = con.createStatement();

            // Create Product Table
            st.executeUpdate("CREATE TABLE product(product_id NUMBER, product_name VARCHAR2(20), price NUMBER)");

            // Insert 3 records
            st.executeUpdate("INSERT INTO product VALUES(1,'Laptop',60000)");
            st.executeUpdate("INSERT INTO product VALUES(2,'Mouse',500)");
            st.executeUpdate("INSERT INTO product VALUES(3,'Keyboard',1200)");

            // Display records
            ResultSet rs = st.executeQuery("SELECT * FROM product");

            System.out.println("Product Records:");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
