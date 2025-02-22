/**
* Author: Muneeb Nafees
* 
* Purpose of the class: A basic implementation of a complete Blackjack game.
*/

public class Blackjack {
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    /*
     * Constructs a new Blackjack game with a new deck, player hand, and dealer hand.
     */
    public Blackjack() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
        deck.shuffle();
    }

    /**
     * Resets the game by creating a new player hand, and dealer hand.
     * If the deck has less than 26 cards, a new deck is created and shuffled.
     */
    public void reset(){
        playerHand = new Hand();
        dealerHand = new Hand();

        if(deck.size() < 26){
            deck = new Deck();
            deck.shuffle();
        }
    }

    /**
     * Deals two cards to the player and two cards to the dealer.
     */
    public void deal(){
        playerHand.add(deck.deal()); // deal a card to the player
        dealerHand.add(deck.deal()); // deal a card to the dealer (face up)
        playerHand.add(deck.deal()); // deal a card to the player
        dealerHand.add(deck.deal()); // deal a card to the dealer (face down)
    }

    /**
     * Draws a card from the deck to the player until the player's hand value is 16 or higher.
     * @return false if the player's hand value is over 21, true otherwise
     */
    public boolean playerTurn(){
        for(int i = playerHand.getTotalValue(); i < 16; i = playerHand.getTotalValue()){
            playerHand.add(deck.deal());
        }

        if(playerHand.getTotalValue()>21){
            return false;
        }
        else{
            return true;
        }
    }
}
