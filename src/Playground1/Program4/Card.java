package Playground1.Program4;

public class Card {

    /**
     * code for the 4 suits
     */
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;

    /**
     * code for the non-numeric cards;
     * numeric cards (2 to 10) have their
     * numerical value for their codes.
     */
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;


    private final int suit;                 // This card's suit which can't be changed once the card is constructed.
    private final int value;                // This card's value which can't be changed once the card is constructed.

    /********************
     * card constructor**
     ********************/
    public Card(int theValue, int theSuit) {

        value = theValue;
        suit = theSuit;
    }

    /****************
     * card methods**
     ***************/

    // suit getter
    public int getSuit() {
        return suit;
    }

    // value getter
    public int getValue() {
        return value;
    }

    // suit as String getter
    public String getSuitAsString() {
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

    // value as String getter
    public String getValueAsString() {
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

    // full String getter for the card (suit + value)
    public String toString() {
        return getValueAsString() + " of " + getSuitAsString();
    }
}
