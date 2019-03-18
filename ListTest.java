import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("lala"));
        books.add(new String("nini"));
        books.add(new String("kaka"));
        System.out.println(books);
        
        books.add(1, new String("papa"));
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        
        books.remove(2);
        System.out.println(books);
        
        System.out.println(books.indexOf(new String("kaka")));
        books.set(1, new String("piupiu"));
        System.out.println(books);
        
        System.out.println(books.subList(1, 2));
    }
}
