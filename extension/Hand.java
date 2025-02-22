public class Hand {

    private ArrayList<Card> hand;

    /**
     * Creates an empty hand as an ArrayList of Cards.  
     */
    public Hand(){
        hand = new ArrayList<Card>();
    }

    /**
     * Removes any cards currently in the hand. 
     */
    public void reset(){
        hand = new ArrayList<Card>();
    }

    /**
     * Adds the specified card to the hand.
     * @param card the card to be added to the hand
     */
    public void add(Card card){
        hand.add(card);
    }

    /**
     * Returns the number of cards in the hand.
     * @return the number of cards in the hand
     */
    public int size(){
        return hand.size();
    }

    /**
     * Returns the card in the hand specified by the given index. 
     * @param index the index of the card in the hand.
     * @return the card in the hand at the specified index.
     */
    public Card getCard(int index){
        return hand.get(index);
    }

    /**
     * Returns the summed value over all cards in the hand.
     * @return the summed value over all cards in the hand
     */
    public int getTotalValue(){
        int totalValue = 0;
        for(int i =0; i<hand.size(); i++){
            totalValue += (hand.get(i)).getValue();
        }

        return totalValue;
    }

    /**
     * Returns true if the hand contains a card with the specified value.
     * @param value of the card to be checked
     * @return true if the hand contains a card with the specified value, false otherwise
     */
    public boolean valueExists(int value){
        for(int i =0; i<hand.size(); i++){
            if((hand.get(i)).getValue() == value){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the hand.
     * @return a string representation of the hand
     */
    public String toString(){
        String handString = "[";
        for(int i =0; i<hand.size(); i++){
            if (i == hand.size()-1){
                handString += (hand.get(i)).toString();
            }
            else{
            handString += (hand.get(i)).toString() + ", ";
            }
        }
        handString += "] : " + Integer.toString(getTotalValue());
        return handString;
    }
}