package JDBC;



import java.sql.*;
 class jdbc {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/product","root", "123456789");
            System.out.println("Connected...!");
            Statement st = con.createStatement();
            st.execute("create table products(pid int (3) , pName varchar (20),price int (10)");
            System.out.println("table created...!");
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}

