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
}
