package Thread;
class ThreadDemo extends Thread{
    public void run(){
       /* System.out.println("IN Child Thread");
        System.out.println(Thread.currentThread()); // Display all properties of the thread [thread_name,priority,thread_grp]
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);*/
        try {
            Thread.sleep(2000);
            System.out.println("In child thread");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

       

    }
} 

public class program1 {

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo td = new ThreadDemo();
        td.start();
       // td.setName("Thread_1");
        td.sleep(1000);
        System.out.println("In Main Thread");
    }

    
}
