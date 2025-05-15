package Thread;

class ThreadDemo1 implements Runnable{
    public void run(){
        System.out.println("In Childs Thread");
    }

}

public class program2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 td1= new ThreadDemo1();
        Thread t = new Thread(td1);
        t.start();
        t.sleep(1000);
        System.out.println("In main Thread");
        
    }
    
}
