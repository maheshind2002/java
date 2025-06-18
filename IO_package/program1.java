package IO_package;
import java.io.*;

public class program1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pqr.txt");
        String str = "Hibernate is an ORM framework";
        fos.write(str.getBytes());    // Convert String into Bytes[]
        fos.close();
        System.out.println("File Created");
        
    }
}
