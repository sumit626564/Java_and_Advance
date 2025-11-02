package JavaCore.MultiThreading.ThreadClass;



class MyThreadRunnableStringName implements Runnable{
    private String name;
    public MyThreadRunnableStringName(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("Thread "+ name + " is running...");
        //int i = 34;
    }
}
public class ThreadRunnableStringName {
    public static void main(String[] args) {
        // create runnable objects
        MyThreadRunnableStringName runnable1 = new MyThreadRunnableStringName("Akash");
        MyThreadRunnableStringName runnable2 = new MyThreadRunnableStringName("Ankit");

        // create Thread objects and assign names
        Thread t1 = new Thread(runnable1, "Thread-1");
        Thread t2 = new Thread(runnable2, "Thread-2");
        
        // Start Thread
        t1.start();
        t2.start();

        // Print their names
        System.out.println("Started: "+ t1.getName());
        System.out.println("Started: "+ t2.getName());
    }
}
