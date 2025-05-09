package array;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arrr = new int[size];
        System.out.println("Enter the " + size + " elements of an array");
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = sc.nextInt();
        }
        System.out.println("Enter the element that you want to find ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] == x) {
               // System.out.println(x + " is at the " + i + " position");
               count++;
                break;
            }

        }
        if(count>0){
            System.out.println(x + " is found");
        }
        else{
        System.out.println("Element not found");
        }
    }

}
