package Playground1.Program4;

public class Game extends Ranks {

    final static int MAX_HAND_SIZE = 5;

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand firstPlayer = new Hand();

        for (int i = 0; i < MAX_HAND_SIZE; i++) {
            firstPlayer.addCard(deck.dealCard());
        }

        // firstPlayer.sortByValue();

        for (int i = 0; i < MAX_HAND_SIZE; i++) {
            System.out.print(firstPlayer.getCard(i).toString());
            System.out.print("; ");
        }

        checkHandRanks(firstPlayer);

        /* manually created cards used to test hand ranks methods */

//        Card card1 = new Card(1, 2);
//        Card card2 = new Card(2, 2);
//        Card card3 = new Card(3, 2);
//        Card card4 = new Card(4, 2);
//        Card card5 = new Card(5, 2);
//
//        Hand rankTestHand = new Hand();
//
//        rankTestHand.addCard(card1);
//        rankTestHand.addCard(card2);
//        rankTestHand.addCard(card3);
//        rankTestHand.addCard(card4);
//        rankTestHand.addCard(card5);
//
//        for (int i = 0; i < MAX_HAND_SIZE; i++) {
//            System.out.print(rankTestHand.getCard(i).toString());
//            System.out.print("; ");
//        }
//
//        checkHandRanks(rankTestHand);

        /* end testings */
    }
}
