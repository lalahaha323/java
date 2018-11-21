/*************************************************************************
	> File Name: PhraseOMatic.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 21时43分12秒
 ************************************************************************/

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","front-end"};
        String[] wordListTwo = {"empowered","sticky","value-added","centric"};
        String[] wordListThree = {"lala","0011","nini"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
