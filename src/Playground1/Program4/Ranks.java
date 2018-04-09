package Playground1.Program4;

public class Ranks {

    static void checkHandRanks(Hand hand) {

        if (isTwoPair(hand)) {
            System.out.println("You have two pairs.");
        } else if (isOnePair(hand)) {
            System.out.println("You have one pair.");
        } else System.out.println("You have Jacks or better.");
    }

    static boolean isTwoPair(Hand hand) {

        hand.sortByValue();
        if (hand.getCard(0).getValue() == hand.getCard(1).getValue() && hand.getCard(2).getValue() == hand.getCard(3).getValue() ||
                hand.getCard(0).getValue() == hand.getCard(1).getValue() && hand.getCard(3).getValue() == hand.getCard(4).getValue() ||
                hand.getCard(1).getValue() == hand.getCard(2).getValue() && hand.getCard(3).getValue() == hand.getCard(4).getValue()) {
            return true;
        }
        return false;
    }

    static boolean isOnePair(Hand hand) {

        hand.sortByValue();
        if (hand.getCard(0).getValue() == hand.getCard(1).getValue() && hand.getCard(1).getValue() != hand.getCard(2).getValue() ||
                hand.getCard(1).getValue() == hand.getCard(2).getValue() && hand.getCard(2).getValue() != hand.getCard(3).getValue() ||
                hand.getCard(2).getValue() == hand.getCard(3).getValue() && hand.getCard(3).getValue() != hand.getCard(4).getValue() ||
                hand.getCard(3).getValue() == hand.getCard(4).getValue()) {
            return true;
        }
        return false;
    }
}
