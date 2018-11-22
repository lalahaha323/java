/*************************************************************************
	> File Name: Ocean2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 21时15分17秒
 ************************************************************************/

interface Swimmer {
    public abstract void swim();
}

class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("鱼 %s 游泳 %n", name);
    }
}

class Human implements Swimmer {
    private String name;
    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("人类 %s 游泳 %n", name);
    }
}

class Submarine implements Swimmer {
    private String name;
    public Submarine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("潜水艇 %s 潜行 %n", name);
    }
}
interface Flyer {
    public abstract void fly();
}

class Seaplane implements Swimmer, Flyer {
    private String name;

    public Seaplane(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.printf("海上飞机 %s 在飞 %n", name);
    }

    @Override
    public void swim() {
        System.out.printf("海上飞机 %s 航行海面 %n", name);
    }
}

class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.println("飞鱼游泳");
    }

    @Override
    public void fly() {
        System.out.println("飞鱼会飞");

    }
}
public class Ocean2 {
    public static void main(String[] args) {
        doSwim(new Human("贾斯汀"));
        doSwim(new Submarine("黄色一号"));
        doSwim(new Seaplane("空军零号"));
        doSwim(new FlyingFish("aha"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}

