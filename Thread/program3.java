package Thread;

// Important program inter process commmunication thread controlling(synchronized(),notify(),notify(), etc )

class Child extends Thread{
    int sum;
    public void run(){
        for(int n = 1;n<=100;n++){
            sum += n;
        }
        synchronized(this){
        notify();
        }
}

}
public class program3 {
    public static void main(String[] args)throws InterruptedException {
        Child c = new Child();
        c.start(); 
        synchronized(c){
            c.wait();
        }
        System.out.println(c.sum);
    }
}
