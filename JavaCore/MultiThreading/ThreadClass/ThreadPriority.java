package JavaCore.MultiThreading.ThreadClass;

/* Background Information:
 *  Java Threads
 *      The JVM defines a range of ten logical priorities for Java Thread, including:
 *      sytnax:-
 *              java.lang.Thread.MIN_PRIORITY = 1
 *              java.lang.Thread.NORM_PRIORITY = 5
 *              java.lang.Thread.MAX_PRIORITY = 10
 * 
 * These values [1..10] are passed into Thread."setPriority(int)" to assign priorities to java thread. The Default priority of a Java thread is NORM_PRIORITY. (A Java thread that doesn't explicitly call "setPriority" runs at NORM_PRIORITY.)
 * A JVM is free to implement priorities in any way it chooses, including ignoring the value.
 * The Java HotSpot virtual machine currently associates each Java Thread with a unique native thread. The relationship between the Java thread and the  native thread is stable and persists for the lifetime of the Java thread.
 */

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        //int i = 34;
        while (true) {
            System.out.println("Thank_you " +  this.getName());
        } 
        
    }
}
public class ThreadPriority {

    public static void main(String[] args) {
        /* Ready Queue: T1, T2, T3, T4, T5 */
        MyThread t1 =  new MyThread("Shubham Singh");
        MyThread t2 = new MyThread("Sumit Singh");
        MyThread t3 = new MyThread("Ankit Singh");
        MyThread t4 = new MyThread("Anuj Singh (Most Important)");

        // if you want to make priority  any particular thread
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        // Start
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}