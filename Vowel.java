import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.println("ENter the Alphabate");
        char s =sc.next().toLowerCase().charAt(0);
        if(Character.isAlphabetic(s)){
        switch (s) {
            case 'a':
                System.out.println(s+" is the vowel");
                break;
            case 'e':
                System.out.println(s+" is the vowel");
                break;
             case 'i':
                System.out.println(s+" is the vowel");
                break;
            case 'o':
                System.out.println(s+" is the vowel");
                break;
             case 'u':
                System.out.println(s+" is the vowel");
                break;
        
            default:
            System.out.println("THe given "+ s+" is a Consonent");
                break;
        }
    }
    }
    
}
