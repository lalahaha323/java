import java.util.ArrayList;
import java.util.List;

class A {
    public boolean equals(Object obj) {
        return true;
    }
}
public class ListTest2 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("lala"));
        books.add(new String("nini"));
        books.add(new String("kaka"));
        System.out.println(books);
        
        books.remove(new A());
        System.out.println(books);
        
        books.remove(new A());
        System.out.println(books);
    }
}
