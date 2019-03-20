class Person {
    private String name;
    private String idStr;
    public Person() {

    }
    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }
    public String getIdStr() {
        return this.idStr;
    }
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj != null && obj.getClass() == Person.class) {
            Person personObj = (Person)obj;
            if(this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}
public class OverrideEqualsRight {
    public static void main(String[] args) {
        Person p1 = new Person("lala", "1234");
        Person p2 = new Person("nini", "1234");
        Person p3 = new Person("kaka", "3456");
        System.out.println("p1 == p2? " + p1.equals(p2));
        System.out.println("p2 == p3? " + p2.equals(p3));
    }
}