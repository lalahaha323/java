public class NullAccessStatic {
    private static void test() {
        System.out.println("static method");
    }
    public static void main(String[] args) {
        NullAccessStatic nas = null;
        nas.test();
    }
}