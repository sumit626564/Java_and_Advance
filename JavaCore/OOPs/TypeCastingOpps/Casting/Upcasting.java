package JavaCore.OOPs.TypeCastingOpps.Casting;

/*
 * Castign in Java (OOPs Concept)
 * Definition:
 *        --> Castign in Java means converting one type of object or variable into another type.
 *        --> ==================================================================================
 *        --> In OOPs, casting is mostly about converting between parent and child classes in an inheritance hierarchy.
 * ##################################//#endregion
 * 
 * (A)  Primitive Type Casting
 * --> Used for converting primitive data types like {int --> double}, {float --> int}, etc.
 *  int a = 10;
 *  double b = a;
 *  int c = (int)b;
 * 
 *   | Type      | Example                       | Description                            |
 *   | --------- | ----------------------------- | -------------------------------------- |
 *   | Widening  | `int → long → float → double` | Automatic conversion (no data loss)    |
 *   | Narrowing | `double → float → long → int` | Manual conversion (possible data loss) |
 * ##########################//#endregion
 * 
 * (B) Object Type Casting (OOPs Casting)
 * --> Used for casting objects within an inheritance hierarchy (parent-child classes).
 * --> There are two types:-
 *                          (2) Upcasting (Child --> Parent)
 *                           --> Safe and Implicit
 *                              --> You can always assign a child object to a parent reference -- no explicit casting needed. This is used for runtime polymorphism.
 */

class Animal{
    void sound(){System.out.println("Animal sound");}
}
class Dog extends Animal{
    void sound(){ System.out.println("Bark");}
    void eat(){System.out.println("Eating bones");}
}

public class Upcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        // a.eat();   ---> Not allowed  (parent refrence)
    }
}

/*
 * Only parent class methods and variable are accessible, but overridden methods of the child are executed (runtime polymorphism).
 */