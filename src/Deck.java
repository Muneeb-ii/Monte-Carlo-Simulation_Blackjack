import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;

    /**
     * Creates the underlying deck as an ArrayList of Card objects. 
     * Calls build() as a subroutine to build the deck itself.
     */
    public Deck() {
        build();
    }

    /**
     * Builds the underlying deck as a standard 52 card deck. 
     * Replaces any current deck stored. 
     */
    public void build() {
        deck = new ArrayList<Card>();
        for (int i = 0; i<4; i++){
            for(int j = 2; j < 12; j++){
                deck.add(new Card(j));
            }
        }
        for (int i = 0; i<12; i++){
            deck.add(new Card(10));
        }
    }

    /**
     * Returns the number of cards left in the deck. 
     * @return the number of cards left in the deck
     */
    public int size() {
        return deck.size();
    }

    /**
     * Returns and removes the first card of the deck.
     * @return the first card of the deck
     */
    public Card deal() {
        return deck.remove(0);
    }

    /**
     * Shuffles the cards currently in the deck. 
     */
    public void shuffle() {
    }

    /**
     * Returns a string representation of the deck.
     * @return a string representation of the deck
     */
    public String toString() {
    }
}