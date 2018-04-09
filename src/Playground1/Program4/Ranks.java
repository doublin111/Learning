package Playground1.Program4;

public class Ranks {

    static void checkHandRanks(Hand hand) {

        if (isThreeOfAKind(hand) > 3.0)
            System.out.println("You have three of a kind.");
        else if (isTwoPair(hand) > 2.0)
            System.out.println("You have two pairs.");
        else if (isOnePair(hand) > 1.0)
            System.out.println("You have one pair.");
        else System.out.println("You have Jacks or better.");
    }


    /********************** Methods for hand rankings. *****************************
     **** It returns a double (ex. 2.0 for two pairs or 3.0 for three of a kind) ***
     **** plus a decimal which represents the high card(s) for cases of hand tie. **
     ******************************************************************************/

    static double isThreeOfAKind(Hand hand) {
        double result = 0.0;

        for (int i = 0; i < 3; i++) {
            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue() && hand.getCard(i).getValue() == hand.getCard(i + 2).getValue()) {
                result = 3.0 + (hand.getCard(i).getValue() * 0.01);
            }
        }
        return result;
    }

    static double isTwoPair(Hand hand) {
        double result = 0.0;
        double value = 0.0;
        int counter = 0;    // number of pairs
        hand.sortByValue();

        for (int i = 0; i < 4; i++) {
            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue()) {
                counter++;
                value = hand.getCard(i).getValue() * 0.01;
            }
        }
        if (counter == 2) {
            result = 2.0 + value;
        }

        return result;
    }

    static double isOnePair(Hand hand) {
        double result = 0.0;
        hand.sortByValue();

        for (int i = 0; i < 4; i++) {
            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue()) {
                result = 1.0 + (hand.getCard(i).getValue() * 0.01);
            }
        }
        return result;
    }
}
