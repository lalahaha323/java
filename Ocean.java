/*************************************************************************
	> File Name: Ocean.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 21时04分50秒
 ************************************************************************/
interface Swimmer {
    public abstract void swim();
}

abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public abstract void swim();
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
        System.out.printf("人类 %s 游泳%n",name);
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
        System.out.printf("潜水艇 %s 潜行%n", name);
    }
}

public class Ocean {
    public static void main(String[] args) {
        doSwim(new Human("贾斯汀"));
        doSwim(new Submarine("黄色一号"));
       // doSwim(new Fish("尼莫"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}

