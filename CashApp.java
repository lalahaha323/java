/*************************************************************************
	> File Name: CashApp.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 13时47分10秒
 ************************************************************************/
class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
}
public class CashApp {
    public static void main(String[] args) {
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
            new CashCard("A004", 2000, 2),
            new CashCard("A005", 3000, 3)
        };

        for(CashCard card : cards) {
            System.out.printf("(%s, %d, %d)%n",card.number, card.balance, card.bonus);
        }
    }
}

