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
        reset();
    }

    /**
     * Resets the game by creating a new player hand, and dealer hand.
     * If the deck has less than 26 cards or is null, a new deck is created and shuffled.
     */
    public void reset(){
        playerHand = new Hand();
        dealerHand = new Hand();

        if(deck == null || deck.size() < 26){
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
            playerHand.add(deck.deal()); // deal a card to the player until the player's hand value is 16 or higher
        }

        if(playerHand.getTotalValue()>21){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Draws a card from the deck to the dealer until the dea;er's hand value is 17 or higher.
     * @return false if the player's hand value is over 21, true otherwise
     */
    public boolean dealerTurn(){
        for(int i = dealerHand.getTotalValue(); i < 17; i = dealerHand.getTotalValue()){
            dealerHand.add(deck.deal()); // deal a card to the dealer until the dealer's hand value is 17 or higher
        }

        if(dealerHand.getTotalValue()>21){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Represents the state of the game as a string.
     * @return a string representation of the game state
     */
    public String toString(){
        return "Player: " + playerHand.toString()+ "\nDealer: " + dealerHand.toString();
    }

    /**
     * Plays a game of Blackjack and returns the result.
     * @param verbose if true, prints the initial and final game state
     * @return 1 if the player wins, -1 if the dealer wins, 0 if it's a push
     */

    public int game(boolean verbose){
        reset();
        deal();
        if (verbose == true){
            System.out.println("Initial game state:");
            System.out.println(this);
            
            boolean playerSafe = playerTurn(); 

            if (playerSafe) { // Checks if the player is safe
                boolean dealerSafe = dealerTurn();

                if(dealerSafe){ // Checks if the dealer is safe
                    int playerTotal = playerHand.getTotalValue();
                    int dealerTotal = dealerHand.getTotalValue();
                    if (playerTotal > dealerTotal) {
                        System.out.println("Final game state:");
                        System.out.println(this);
                        System.out.println("Player wins!");
                        return 1;
                    } 
                    else if (dealerTotal > playerTotal) {
                        System.out.println("Final game state:");
                        System.out.println(this);
                        System.out.println("Dealer wins!");
                        return -1;
                    } 
                    else {
                        System.out.println("Final game state:");
                        System.out.println(this);
                        System.out.println("It's a push (tie)!");
                        return 0;
                    }
                }
                else{
                    System.out.println("Final game state:");
                    System.out.println(this);
                    System.out.println("Player wins!");
                    return 1;
                }
            }

            else {
                System.out.println("Final game state:");
                System.out.println(this);
                System.out.println("Dealer wins!");
                return -1;
            }
        
        }
        else{
            boolean playerSafe = playerTurn();

            if (playerSafe) {
                boolean dealerSafe = dealerTurn();

                if(dealerSafe){
                    int playerTotal = playerHand.getTotalValue();
                    int dealerTotal = dealerHand.getTotalValue();
                    if (playerTotal > dealerTotal) {
                        return 1;
                    } 
                    else if (dealerTotal > playerTotal) {
                        return -1;
                    } 
                    else {
                        return 0;
                    }
                }
                else{
                    return 1;
                }
            }

            else {
                return -1;
            }
        }

    }

    /**
     * Main method to play a game of Blackjack.
     * @param args
     */
    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.reset();
        game.deal();
        System.out.println("Initial game state:");
        System.out.println(game);
        
        // Player's turn
        boolean playerSafe = game.playerTurn();
        System.out.println("After player's turn:");
        System.out.println(game);
        
        // If player busts, game over.
        if (!playerSafe) {
            System.out.println("Player busted! Dealer wins.");
        }

        else {
            // Dealer's turn
            boolean dealerSafe = game.dealerTurn();
            System.out.println("After dealer's turn:");
            System.out.println(game);
        
            // Determine outcome based on totals and bust status.
            if (!dealerSafe) {
                System.out.println("Dealer busted! Player wins.");
            } 
            else {
                int playerTotal = game.playerHand.getTotalValue();
                int dealerTotal = game.dealerHand.getTotalValue();
                if (playerTotal > dealerTotal) {
                    System.out.println("Player wins!");
                } else if (dealerTotal > playerTotal) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("It's a push (tie)!");
                }
            }
        }
    }
}
