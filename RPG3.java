/*************************************************************************
	> File Name: RPG3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 18时33分58秒
 ************************************************************************/

class Role {
    private String name;
    private int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fight() {
        
    }
}

class SwordsMan extends Role {
    public void fight() {
        System.out.println("挥剑攻击");
    }
}

class Magician extends Role {
    public void fight() {
        System.out.println("魔法攻击");
    }
}

public class RPG3 {
    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(100);  

        Magician magician  = new Magician();
        magician.setName("Monica");
        magician.setLevel(2);
        magician.setBlood(1000);

        drawFight(swordsMan);
        drawFight(magician);
    }

    static void drawFight(Role role) {
        System.out.print(role.getName());
        role.fight();
    }
}

