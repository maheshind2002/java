package Thread;

 class MyThread extends Thread  {
    
    public void run() {
        System.out.println("Thread name is: " + Thread.currentThread().getName());
    }
}

 class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("ChildThread-1");
        t1.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}


