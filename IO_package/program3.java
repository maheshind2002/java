package IO_package;
import java.io.*;

public class program3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("pqr.txt");
        int size = fis.available();   // returned the size of the file
        byte [] Buffer = new byte[size];
        fis.read(Buffer);
        String str = new String(Buffer); // convert byte[] into Strings
        System.out.println(str);
        fis.close();

        
    }   
}
