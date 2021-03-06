package Playground1.Program4;

@SuppressWarnings("unused")
class Deck {

    /* An array of 52 cards */
    @SuppressWarnings("CanBeFinal")
    private Card[] deck;

    /* Keeps track of the number of cards that have been dealt from
     * the deck so far. */
    private int cardsUsed;

    /* Constructs a regular 52-card poker deck. Initially, the cards
     * are in a sorted order. The shuffle() method can be called to
     * randomize the order. */
    Deck() {
        deck = new Card[52];
        int cardsCreated = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[cardsCreated] = new Card(value, suit);
                cardsCreated++;
            }
        }
        cardsUsed = 0;
    }

    /* Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order. */
    void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    /* As cards are dealt from the deck, the number of cards left
     * decreases. This function returns the number of cards that
     * are still left in the deck.  The return value would be
     * 52 when the deck is first created or after the deck has been
     * shuffled. It decreases by 1 each time the dealCard() method
     * is called. */
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    /* Removes the next card from the deck and return it. It is illegal
     * to call this method if there are no more cards in the deck. You can
     * check the number of cards remaining by calling the cardsLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck. */
    Card dealCard() {
        if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
    }
}
