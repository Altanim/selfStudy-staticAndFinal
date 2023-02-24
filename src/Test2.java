public class Test2 {

    public static int summ(int a, int b, int c) {
        return a + b + c;
    }

    static void div(int a, int b) {
        System.out.println("Common: " + a / b + ", decimal " + a % b);
    }
}

class Solve {
    public static void main(String[] args) {
        System.out.println(Test2.summ(546, 5, -478));
        System.out.println(Test2.summ(9999, 3456, 87));
        Test2.div(75,68);
        Test2.div(6666, 87);
    }
}
