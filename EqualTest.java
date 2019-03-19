public class EqualTest {
    public static void main(String[] args) {
        int it = 65;
        float f1 = 65.0f;
        System.out.println(it == f1);
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
    }
}