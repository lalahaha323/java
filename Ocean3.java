/*************************************************************************
	> File Name: Ocean3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 21时52分13秒
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

class Human {
    protected String name;
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SwimPlayer extends Human implements Swimmer {
    public SwimPlayer(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("游泳选手 %s 游泳 %n", name);
    }
}

class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("飞机 %s 在飞 %n", name);
    }
}

class Airplane implements Flyer {
    protected String name;
    public Airplane(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.printf("飞机 %s 在飞%n", name);
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

class Seaplane extends Airplane implements Swimmer {
    public Seaplane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.print("海上");
        super.fly();
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
public class Ocean3 {
    public static void main(String[] args) {
        doSwim(new SwimPlayer("贾斯汀"));
        doSwim(new Submarine("黄色一号"));
        doSwim(new Seaplane("空军零号"));
        doSwim(new FlyingFish("aha"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}

