package JavaCore.OOPs.TypeCastingOpps.Casting;

/*
 * Imagine a Vehicle as the parent class and Car as a child class.
 * --> Upcasting: Treat a "Car" as a general "Vehicale" (You can only use "Vehicle" methods).
 * --> Downcasting: Treat a "Vehicle"  as a specific "Car" (to access car-specific featirs).
 */

 // Example with interface Casting
interface Animal { void sound();}
class Dog implements Animal{
    public void sound(){System.out.println("Bark");}
    public void eat(){ System.out.println("Eating");}
}

public class RealLifeExample {
    public static void main(String[] args) {
        Animal a = new Dog();   // upcast
        Dog d = (Dog) a;      // downcast
        d.eat();
    }
}
