package patternsjava.structural.decorator.cards;

import patternsjava.structural.decorator.Credit;

public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("Credit Golds");
    }
}
