package assigment;
//-----------------------*---------------------------------------------------------------
   // WAP to find greater number
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements that you have to compare");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is larger");
        } else if (n2 > n3) {
            System.out.println(n2 + " is the largest number");
        }

    }
}
