package JavaCore.OOPs.TypeCastingOpps.Casting;

class A {}
class B extends A {}
class C extends B {}
public class CastingHierarchy {
    public static void main(String[] args) {
        A a1 =new C();  // upcast
        B b1 = (B) a1;   // Downcast to B
        C c1 = (C) b1;    // Further downcast to C
    }   
}
