public class FinalVariableTest {
    final int a = 6;
    final String str;
    final int c;
    final static double d;
    {
        str = "lala";
    }
    static
    {
        d = 5.6;
    }
    public FinalVariableTest() {
        c = 5;
    }
    public static void main(String[] args) {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
    }
}