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

        firstPlayer.sortByValue();

        for (int i = 0; i < MAX_HAND_SIZE; i++) {
            System.out.print(firstPlayer.getCard(i).toString());
            System.out.print("; ");
        }

        checkHandRanks(firstPlayer);
    }
}
