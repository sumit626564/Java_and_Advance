package JavaCore.OOPs.TypeCastingOpps.Casting;

/*
 * Risk and must be explicit
 * You convert a parent reference back to a child type. it require explicit casting using parentheses.
 * 
 * Syntax or Method:-
 *                  Animal a new Dog();     // Upcasting
 *                  Dog d = (Dog) a;        // Downcasting
 *                  d.eat();                // Now child-specific method accessible
 * #####//#endregion But if the object is not actually of that child type  -->  ClassCastException
*/
public class DownCasting {
    public static void main(String[] args) {
        // // Unsafe Example:-
        Animal a = new Animal();
        // Dog d = (Dog) a;  // Runtime error: ClassCastException

        if(a instanceof Dog){
            Dog d = (Dog) a;  // safe downcast
            d.eat();
        }
    }
}
