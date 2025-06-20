package JDBC;


import java.sql.*;


public class program5{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/product","root", "123456789");
            System.out.println("Connected...!");
            Statement st = con.createStatement();
            
            //      Resultset  Operation         //

            ResultSet rs = st.executeQuery("select * from products");
            while (rs.next()) {
                System.out.println(rs.getInt("pid")+ " " +rs.getString("pName")+ " " + rs.getFloat(3));
                
            }
            st.close();
            con.close();
    }
    catch(Exception e){
        System.out.println(e);

    }
    
}
}
