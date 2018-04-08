package Playground1.Program4;

public class Ranks {

    static void checkHandRanks(Hand hand) {

        if (isTwoPair(hand)) {
            System.out.println("You have two pairs.");
        } else if (isOnePair(hand)) {
            System.out.println("You have one pair.");
        }
    }

    static boolean isOnePair(Hand hand) {

        hand.sortByValue();
        if (hand.getCard(0) == hand.getCard(1) && hand.getCard(1) != hand.getCard(2) ||
                hand.getCard(1) == hand.getCard(2) && hand.getCard(2) != hand.getCard(3) ||
                hand.getCard(2) == hand.getCard(3) && hand.getCard(3) != hand.getCard(4) ||
                hand.getCard(3) == hand.getCard(4) && hand.getCard(4) != hand.getCard(5)){
            System.out.println("test");
            return true;
        }
        return false;
    }

    static boolean isTwoPair(Hand hand) {

        hand.sortByValue();
        if (hand.getCard(0) == hand.getCard(1) && hand.getCard(2) == hand.getCard(3)) {
            return true;
        }
        return false;
    }
}
