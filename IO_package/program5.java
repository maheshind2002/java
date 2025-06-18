package IO_package;
import java.io.*;

// if you want to go with the different data types in the file that you 
// should go with the  DataOutputStream

public class program5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hibernate");  // Method for String Writting
        dos.writeInt(25);           // -----------integer Writting
        dos.writeDouble(23.45);     // -----------DOuble Writting
        System.out.println("File Created");
        dos.close();
        fos.close();
        
    }
    
}
