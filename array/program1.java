package array;
import java.util.*;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int [] n = new int[size];
        System.out.println("Enter "+ size +" of an array");
        for(int i = 0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Elements enterd successfully...!");
    }
}
