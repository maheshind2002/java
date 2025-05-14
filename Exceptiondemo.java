import java.util.Scanner;

class WithdralException extends Exception{
    WithdralException(String msg){
        super(msg);
    }
    WithdralException(){

    }
}
class Account{
    void Withdral(int amount,int balance)throws WithdralException{
        if(amount>balance){
            throw new WithdralException("Insufficient Funds");
        }
        else{
            System.out.println("Your Transaction is been Processed \n Please wait...!");

        }
    }
}
public class Exceptiondemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
         System.out.println("Enter Balance");
        int balance = sc.nextInt();
        Account ac = new Account();
        try {
            ac.Withdral(amount,balance);
        } catch (WithdralException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
