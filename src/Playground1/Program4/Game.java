package Playground1.Program4;

public class Game {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Hand player1 = new Hand();
        String[] player1cards = null;


        for (int i = 0; i < 5; i++) {
            player1.addCard(deck.dealCard());
        }

        for (int i = 0; i < 5; i++) {
            player1cards[i] = player1.getCard(i).toString();
        }

        System.out.println(player1cards);
    }
}
