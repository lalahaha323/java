/*************************************************************************
	> File Name: CashApp2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 13时53分16秒
 ************************************************************************/
import java.util.Scanner;
class CashCard {
    String number;
    int balance;
    int bonus;
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money) {
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("储值是负的？你是乱来的？");
        }
    }

    void charge(int money) {
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            } else {
                System.out.println("钱不够啦!");
            }
        } else {
            System.out.println("扣负数？？？");
        }
    } 

    int exchange(int bonus) {
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}

public class CashApp2 {
    public static void main(String[] args) {
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000 ,1)
        };

        Scanner scanner = new Scanner(System.in);
        for(CashCard card : cards) {
            System.out.printf("为(%s, %d, %d) 储值：",card.number, card.balance, card.bonus);
            card.store(scanner.nextInt());
            System.out.printf("明细 (%s, %d, %d)%n",card.number, card.balance, card.bonus);
        }
    }
}

