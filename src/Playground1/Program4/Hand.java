package Playground1.Program4;

import java.util.ArrayList;

class Hand {

    private ArrayList<Card> hand;


    /* Create a hand that is initially empty. */
    Hand() {
        hand = new ArrayList<>();
    }

    /* Remove all cards from the hand, leaving it empty */
    void clear() {
        hand.clear();
    }

    /* Add a card to the hand. It is added at the end of the current hand.
     * @param c the non-null card to be added.
     * @throws NullPointerException if the parameter c is null. */
    void addCard(Card c) {
        if (c == null)
            throw new NullPointerException("Can't add a null card to a hand.");
        hand.add(c);
    }

    /* Remove a card from the hand, if present.
     * @param c the card to be removed. If c is null or if the card is not in
     * the hand, then nothing is done. */
    void removeCard(Card c) {
        hand.remove(c);
    }

    /* Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand. */
    void removeCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Position does not exist in hand: " + position);
        hand.remove(position);
    }

    /* Returns the number of cards in the hand. */
    int getCardCount() {
        return hand.size();
    }

    /* Gets the card in a specified position in the hand. Note that this card
     * is not removed from the hand!
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand */
    Card getCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Position does not exist in hand: " + position);
        return hand.get(position);
    }

    /* Sorts the cards in the hand so that cards of the same suit are
     * grouped together, and within a suit the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1. */
    public void sortBySuit() {
        ArrayList<Card> newHand = new ArrayList<>();
        while (hand.size() > 0) {
            int pos = 0;  // Position of minimal card.
            Card c = hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if (c1.getSuit() < c.getSuit() ||
                        (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue())) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }

    /* Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by suit.
     * Note that aces are considered to have the lowest value, 1. */
    void sortByValue() {
        ArrayList<Card> newHand = new ArrayList<>();
        while (hand.size() > 0) {
            int pos = 0;  // Position of minimal card.
            Card c = hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if (c1.getValue() < c.getValue() ||
                        (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit())) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }


}
