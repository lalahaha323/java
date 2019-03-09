public class ReplaceTest {
    public static void main(String[] args) {
        String Str = new String("hello runoob, I am from runoob");
        System.out.print("返回值 :");
        System.out.println(Str.replaceFirst("runoob", "google"));
        System.out.print("返回值 :");
        System.out.println(Str.replaceFirst("(.*)runoob(.*)", "google"));
    }
}