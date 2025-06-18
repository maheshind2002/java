package IO_package;
import java.io.*;
public class program7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text.txt");
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
        int x = dis.readInt();
        System.out.println(x);
        double y = dis.readDouble();
        System.out.println(y);
        dis.close();
        fis.close();
        
    }
    
}
