package JDBC;


import java.sql.*;


public class program2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/product","root", "123456789");
            System.out.println("Connected...!");
            Statement st = con.createStatement();
            st.executeUpdate("insert into products values(111,'mouse',650)");
            st.executeUpdate("insert into products values(222,'keyboard',850)");
            st.executeUpdate("insert into products values(333,'ups',2000)");
            System.out.println("inserted...!");
    }
    catch(Exception e){
        System.out.println(e);

    }
    
}
}
