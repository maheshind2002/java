package IO_package;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// using BufferedOutputStream to increase th performance of the fos.write method
public class program2 {
     public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pqr.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "Hibernate is an ORM framework";
        fos.write(str.getBytes());    // Convert String into Bytes[]
        bos.close();
        fos.close();
        System.out.println("File Created");
        
    }
}
