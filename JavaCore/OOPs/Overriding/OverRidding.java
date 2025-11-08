package JavaCore.OOPs.Overriding;

/*
 *  What is Method Overriding ..?
 *  "Method overriding" occurs when a "child class"(subclass) provides its "own version" of a  method that is "already defined" in the parent class (superclass).
 *  
 *  Key Points:-
 *             --> Both methods must have the "same name, same parameters", and "same return type" (or compitable one).
 *             --> It heppens in inheritance (when one class extends another).
 *             --> The {@Overried} annotation is ued to indicate that a method is being overrideen (optional but recommneded).
 *             --> Runtime Polymorphism -- The method that gets executed is decided at runtime based on the object type.
 * 
 * | Rule            | Description                                      |
 * | --------------- | ------------------------------------------------ |
 * | Access modifier | Can’t be more restrictive than the parent method |
 * | Return type     | Must be the same or covariant                    |
 * | Static methods  | Can’t be overridden (they are hidden)            |
 * | Constructors    | Can’t be overridden                              |
 * | Final methods   | Can’t be overridden                              |

 */
class Parent{
    public void Dog(){
        System.out.println("Dog");
    }
}
class child extends Parent{
    @Override
    public void Dog(){
        System.out.println("Dog Id Barking");
    }
}
public class OverRidding {
    public static void main(String[] args) {
        child ch = new child();
        ch.Dog();
    }
}
