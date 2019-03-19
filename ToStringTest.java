class Apple {
    private String color;
    private double weight;
    public Apple() {
    }
    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public String toString() {
        return  "Apple[color= " +color + ",weight=" + weight + "]";
    }
}
public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("red", 5.68);
        System.out.println(a);
    }
}