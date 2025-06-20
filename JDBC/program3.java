package JDBC;


import java.sql.*;


public class program3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/product","root", "123456789");
            System.out.println("Connected...!");
            Statement st = con.createStatement();
            
              //      Update  Operation         //

            st.executeUpdate("update products set price = 800");
            int n = st.executeUpdate("update products set price = 800");
            System.out.println(n + " records updated...!");
            st.close();
            con.close();
    }
    catch(Exception e){
        System.out.println(e);

    }
    
}
}
