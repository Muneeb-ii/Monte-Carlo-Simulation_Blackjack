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
}
