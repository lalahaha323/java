/*************************************************************************
	> File Name: DogTest.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 22时22分16秒
 ************************************************************************/
import java.util.ArrayList;
import java.util.Collection;

class Dog {
    private String name;
    public String getName() {
        return name;
    }
    Dog(String name) {
        this.name = name;
    }
}
public class DogTest {
    public static void main(String[] args) {
        Collection c2 = new ArrayList();
        c2.add(new Dog("Wc"));
        c2.add(new Dog("WC"));
        Object[] arr2 = c2.toArray();
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

