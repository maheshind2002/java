package array;
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter "+size+" elements an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        sc.close();
        System.out.println("The sum of "+ size + " elements an array is "+ sum);
    }
    
}
