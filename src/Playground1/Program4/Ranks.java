package Playground1.Program4;

class Ranks {

    static void checkHandRanks(Hand hand) {

        if (isFlush(hand) > 5.0)
            System.out.println("You got a flush.");
        else if (isStraight(hand) > 4.0)
            System.out.println("You have a straight.");
        else if (isThreeOfAKind(hand) > 3.0)
            System.out.println("You have three of a kind.");
        else if (isTwoPair(hand) > 2.0)
            System.out.println("You have two pairs.");
        else if (isOnePair(hand) > 1.0)
            System.out.println("You have one pair.");
        else System.out.println("You have Jacks or better.");
    }


    /************************ Methods for hand rankings. ********************************
     **** It returns a double (ex. 2.0 for two pairs or 3.0 for three of a kind) ********
     **** plus a decimal which represents the high card(s) when two or more *************
     **** players have the same hands. **************************************************
     ***********************************************************************************/

    static double isFlush(Hand hand) {
        hand.sortByValue();
        double result = 0.0;
        String suit = hand.getCard(0).getSuitAsString();

        if (hand.getCard(0).getSuitAsString().equals(suit)) {
            if (hand.getCard(1).getSuitAsString().equals(suit)) {
                if (hand.getCard(2).getSuitAsString().equals(suit)) {
                    if (hand.getCard(3).getSuitAsString().equals(suit)) {
                        if (hand.getCard(4).getSuitAsString().equals(suit)) {
                            result = 5.0 + (hand.getCard(4).getValue() * 0.01);
                        }
                    }
                }
            }
        } else result = 0.0;
        return result;

        /* this for loop doesn't function correctly; must be fixed */
//        for (int i = 0; i < 4; i++) {
//            result = 5.0 + (hand.getCard(i).getValue() * 0.01);
//            if (!hand.getCard(i).getSuitAsString().equals(suit))
//                result = 0.0;
//        }
//        return result;
    }

    static double isStraight(Hand hand) {
        hand.sortByValue();
        double result = 0.0;

        if (hand.getCard(0).getValue() == hand.getCard(1).getValue() - 1) {
            if (hand.getCard(1).getValue() == hand.getCard(2).getValue() - 1) {
                if (hand.getCard(2).getValue() == hand.getCard(3).getValue() - 1) {
                    if (hand.getCard(3).getValue() == hand.getCard(4).getValue() - 1)
                        result = 4.0 + (hand.getCard(4).getValue() * 0.01);
                }
            }
        } else result = 0.0;
        return result;

        /* this for loop doesn't function correctly; must be fixed. */
//        for (int i = 0; i < 4; i++) {
//            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue() - 1) {
//                result = 4.0 + (hand.getCard(i).getValue() * 0.01);
//            } else result = 0.0;
//        }
//        return result;
    }

    static double isThreeOfAKind(Hand hand) {
        hand.sortByValue();
        double result = 0.0;

        for (int i = 0; i < 3; i++) {
            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue() && hand.getCard(i).getValue() == hand.getCard(i + 2).getValue()) {
                result = 3.0 + (hand.getCard(i).getValue() * 0.01);
            }
        }
        return result;
    }

    static double isTwoPair(Hand hand) {
        hand.sortByValue();
        double result = 0.0;
        double value = 0.0;
        int counter = 0;    // track number of pairs

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
        hand.sortByValue();
        double result = 0.0;

        for (int i = 0; i < 4; i++) {
            if (hand.getCard(i).getValue() == hand.getCard(i + 1).getValue()) {
                result = 1.0 + (hand.getCard(i).getValue() * 0.01);
            }
        }
        return result;
    }
}
