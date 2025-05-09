package array;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("Enter " + size + " of an array");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Elements enterd successfully...!");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }
        /*--------------------------*-----------*/
        // ALso we can use th foreach loop to do it using foreach we can also display the elements of the array
        System.out.println("Array Elements are");
        for(int x:n){//foreach loop
            System.out.println(x);
        }   
    }
}
