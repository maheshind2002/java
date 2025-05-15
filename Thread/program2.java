package Thread;
// ---------------------------------*********** ----------------------------------*************--------------------------------
// Creating the thread using runnable interface
class ThreadDemo1 implements Runnable{
    public void run(){
        System.out.println("In Childs Thread");
    }

}

public class program2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 td1= new ThreadDemo1();
       // td1.start(); ----------------------- /// Here is a error due to the start methodd is only in the thread class
        Thread t = new Thread(td1);// therfore here we have to create object of the thread class and pass td1 as arguement to it
        t.start();                
        t.sleep(1000);
        System.out.println("In main Thread");
        
    }
    
}
