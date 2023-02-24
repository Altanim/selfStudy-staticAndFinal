public class Test3 {
    public final static double pi = 3.14;
    public double area (double r){
        double ar = pi * r * r;
        return ar;
    }
    public static double len (double r2){
        double l = 2*pi*r2;
        return l;
    }
    public void info(double radius){
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area(radius));
        System.out.println("Circumference = " + len(radius));
    }

}
class Solve2 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.info(3);
        System.out.println(t.area(7));
        System.out.println(Test3.len(76));
    }
}