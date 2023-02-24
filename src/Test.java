public class Test {
//    final - read only, variable must be initialized
    public final int i;
    Test(){
        i = 1;
    }
    Test(boolean b){
        i = 10;
    }
//    in the method's body it is not necessary to initialize in advance
    public void abc(int a){
        final byte b;
        b = 10;
        System.out.println(b);
    }
    public static void main(String[] args) {
        Test test = new Test();
//        test.i = test.i / 5;
        System.out.println(test.i);
    }
}