class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
    AgeException(){

    }
}
class Age{
    void display(int age)throws AgeException{
        if(age<18 || age>60){
            throw new AgeException("Age should be in the 18 & 60");
        }
        else{
            System.out.println("Enterd Age is Good...!");
        }
    }
}
public class AgeExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start Program");
        Age a = new Age();
        try {
             a.display(16);
        } catch (AgeException e) {
           System.out.println(e.getMessage()); 
        }
       System.out.println("End Program");
        
        
    }
    
}
