package JavaCore.OOPs.TypeCastingOpps;

/*
* Casting  in Java means converting one type of object or variable into another type.
*  In OOPs, casting is mostly about converting between parent and child classes in inheritance hierarchy.
* 
*  There are ttwo type of casting:
*      (1) Primittive Type Casting
*          (*) // imlicit (widening)  ---> Automatic conversion (no data loss)
*          (*)  // explicit (narrowing)   --> Manual conversion (possible data loss)
* 
*      (2) Object Type Casting
*          (*)   Upcasting (Child --> Parent)
*              "you can always a child object to a parent refrence -- no explicit casting needed.  This is used fro runtime polymorphism."
* 
*          (*)  Downcasting (Parent -->  Child)
*             """Risky and must be explicit
*                  You convert a parent reference back to child type
*                  It requires explicit casting using parentheses.
*                  """
*              Note:- Use of "instanceof" before Downcasting
*                          """To prevent runtime errors, always check the object type using the "instanceof" operator. """
* 
* """ Why Use Casting in OOPs..?
*
* | ------------------------------------------------------------------------ |
* |        | Reason               | Description                              |            |
* | -------------------- | ------------------------------------------------- |
* | **Polymorphism**     | Enables runtime binding using parent references.  |
* | **Code Reusability** | Write general code that works for all subclasses. |
* | **Flexibility**      | Change behavior dynamically at runtime.           |
* |--------------------- | ------------------------------------------------- |
* """
 */

public class FirstypeCasting {
    public static void main(String[] args) {
        String stream;
    }
}
