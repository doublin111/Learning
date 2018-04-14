package Playground1.Program4;

class Card {

    /* Named constants representing the suits */
    private final static int SPADES = 0;
    private final static int HEARTS = 1;
    private final static int DIAMONDS = 2;
    private final static int CLUBS = 3;

    /* Named constants representing the non-numeric card values;
     * numeric cards 2 to 10 have their numeric values for their code */
    private final static int ACE = 1;
    private final static int JACK = 11;
    private final static int QUEEN = 12;
    private final static int KING = 13;

    /* This card's suit and value */
    private final int suit;
    private final int value;

    /* Card constructor */
    Card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }

    /************************
     ***** card methods *****
     ************************/

    /* Two getters for the card's suit and value*/
    int getSuit() {
        return suit;
    }

    int getValue() {
        return value;
    }

    /* Getter for the card's suit as String */
    String getSuitAsString() {
        switch (suit) {
            case SPADES:
                return "Spades";
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            default:
                return "Clubs";
        }
    }

    /* Getter for the card's value as String */
    String getValueAsString() {
        switch (value) {
            case ACE:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            default:
                return "King";

        }
    }

    /* Getter for a complete card as String (suit and value) */
    public String toString() {
        return getValueAsString() + " of " + getSuitAsString();
    }
}
