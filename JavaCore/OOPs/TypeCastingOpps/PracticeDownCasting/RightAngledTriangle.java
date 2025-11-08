package JavaCore.OOPs.TypeCastingOpps.PracticeDownCasting;

public class RightAngledTriangle extends Triangle {
    int sides;
    public static void main(String[] args) {
        Triangle tr = new RightAngledTriangle();
        System.out.println(tr.area);
        tr.computeArea();
        System.out.println(tr.base);
        System.out.println(tr.height);
        System.out.println(((RightAngledTriangle)tr).sides);
    }
}
