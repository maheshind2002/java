package IO_package;
import java.io.*;

public class program6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text.txt");
        DataInputStream dis = new DataInputStream(fis);
        int size = fis.available();
        byte [] Buffer = new byte[size];
        dis.readFully(Buffer);
        String str = new String(Buffer);
        System.out.println(str);
        dis.close();
        fis.close();

        
    }
    
}
