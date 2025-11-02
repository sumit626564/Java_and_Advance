package JavaCore.MultiThreading.ThreadClass;

/* Below are the Commonly used constructor of thread class.
 *  1. Thread()             2. Thread (String Name)
 *  3. Thread(Runnable)     4. Thread(Runnable String Name)
 */

class  Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
<<<<<<< HEAD
        int i =  34;
=======
      //  int i =  34;
>>>>>>> 6987044 (Initial System Update)
        System.out.println("Thank you");

        //while (true) {
        //    
        //    System.out.println("I am thread");
        //}
    }
}
public class ThreadStringName {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Sumit"); /* if you have multiple thread */
        Mythr t2 = new Mythr("Harry");
        t1.start();
        t2.start();
<<<<<<< HEAD
        System.out.println("The id of the thread t is "+ t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t2 is "+ t2.getId());
=======
       // System.out.println("The id of the thread t is "+ t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
       // System.out.println("The id of the thread t2 is "+ t2.getId());
>>>>>>> 6987044 (Initial System Update)
        System.out.println("The is of thread t2 is "+ t2.getName());
    }
}