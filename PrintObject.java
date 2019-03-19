class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
}
public class PrintObject {
    public static void main(String[] args) {
        Person p = new Person("lala");
        System.out.println(p);
        
    }
}