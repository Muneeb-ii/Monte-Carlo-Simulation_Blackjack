public class Card {

    /**
     * The value of the card.
     */
    private int value;

    /**
     * Constructs a card with the specified value.
     * @param val
     */
    public Card(int val) {
        if (val < 2 || val >11) {
            System.out.println("Invalid card value: " + val);
        }
        else {
            value = val;
        }
        
    }

    /**
     * Returns the value of the card.
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Sets the value of the card.
     * @param val the value to set
     */
    public void setValue(int val){
        value = val;
    }
    
    /**
     * Returns a string representation of this card.
     * @return a string representation of this card
     */
    public String toString() {
        return Integer.toString(value);
    }
}