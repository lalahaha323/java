public class FinalReplaceTest {
    public static void main(String[] args) {
        final int a = 5 + 2;
        final double b = 1.2 / 3;
        final String str = "crazy" + "Java";
        final String book = "crazy book Java" + 99.0;
        final String book2 = "crazy book Java" + String.valueOf(99.0);
        System.out.println(book == "crazy book Java99.0");
        System.out.println(book2 == "crazy book Java99.0");
    }
}