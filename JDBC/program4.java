package JDBC;


import java.sql.*;


public class program4{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/product","root", "123456789");
            System.out.println("Connected...!");
            Statement st = con.createStatement();
            
             //      Delete  Operation         //

            st.executeUpdate("delete from products");
            int m =st.executeUpdate("delete from products");
             System.out.println(m + " records deleted...!");
            st.close();
            con.close();
    }
    catch(Exception e){
        System.out.println(e);

    }
    
}
}
