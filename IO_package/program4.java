package IO_package;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//  BufferedInputStream it is to increase the performance of the method and system
public class program4 {
     public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("pqr.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int size = fis.available();   // returned the size of the file
        byte [] Buffer = new byte[size];
        fis.read(Buffer);
        String str = new String(Buffer); // convert byte[] into Strings
        System.out.println(str);
        bis.close();
        fis.close();

        
    }   
}
