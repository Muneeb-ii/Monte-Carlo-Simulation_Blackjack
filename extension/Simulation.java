
/**
 * Author: Muneeb Nafees
 * 
 * Purpose of the class: To simulate 100, 1000, and 10,000 games of blackjack 
 * and print the percentage of draws, dealer wins, and player wins along with 
 * the final pot amounts for both the player and dealer.
 * 
 */

 public class Simulation {

    /**
     * Runs 100, 1000, and 10,000 games of blackjack and prints the percentage of draws, dealer wins, and 
     * player wins along with the final pot amounts for both the player and dealer.
     */
    public static void main(String[] args){
        int dealerWins = 0;
        int playerWins = 0;
        int draws = 0;
        double playerPot = 200.0; // Player starts with $200
        double dealerPot = 200.0; // Dealer starts with $200
        Blackjack game = new Blackjack();

        for (int i = 0; i < 100; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
                playerPot = playerPot + dealerPot/2; // Player receives half of the pot
                dealerPot = dealerPot/2; // Dealer pays half of the pot to the player
            } 
            else if (result == -1) {
                dealerWins++;
                dealerPot = dealerPot + playerPot/2; // Dealer receives half of the pot
                playerPot = playerPot/2; // Player pays half of the pot to the dealer
            } 
            else {
                draws++; // No one wins
            }
        }

        System.out.println("Results for 100 games of blackjack:");
        System.out.println("Draw percent: " + draws);
        System.out.println("Dealer win percent: " + dealerWins);
        System.out.println("Player win percent: " + playerWins);
        System.out.println("Player pot: " + playerPot);
        System.out.println("Dealer pot: " + dealerPot);

        dealerWins = 0;
        playerWins = 0;
        draws = 0;
        playerPot = 200.0; 
        dealerPot = 200.0; 

        for (int i = 0; i < 1000; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
                playerPot = playerPot + dealerPot/2; // Player receives half of the pot
                dealerPot = dealerPot/2; // Dealer pays half of the pot to the player
            } 
            else if (result == -1) {
                dealerWins++;
                dealerPot = dealerPot + playerPot/2; // Dealer receives half of the pot
                playerPot = playerPot/2; // Player pays half of the pot to the dealer
            } 
            else {
                draws++; // No one wins
            }
        }

        System.out.println("Results for 1000 games of blackjack:");
        System.out.println("Draw percent: " + (draws*100)/ 1000);
        System.out.println("Dealer win percent: " + (dealerWins*100)/ 1000);
        System.out.println("Player win percent: " + (playerWins*100)/ 1000);
        System.out.println("Player pot: " + playerPot);
        System.out.println("Dealer pot: " + dealerPot);

        dealerWins = 0;
        playerWins = 0;
        draws = 0;
        playerPot = 200.0; 
        dealerPot = 200.0; 

        for (int i = 0; i < 10000; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
                playerPot = playerPot + dealerPot/2; // Player receives half of the pot
                dealerPot = dealerPot/2; // Dealer pays half of the pot to the player
            } 
            else if (result == -1) {
                dealerWins++;
                dealerPot = dealerPot + playerPot/2; // Dealer receives half of the pot
                playerPot = playerPot/2; // Player pays half of the pot to the dealer
            } 
            else {
                draws++; // No one wins
            }
        }

        System.out.println("Results for 10,000 games of blackjack:");
        System.out.println("Draw percent: " + (draws*100)/ 10000);
        System.out.println("Dealer win percent: " + (dealerWins*100)/ 10000);
        System.out.println("Player win percent: " + (playerWins*100)/ 10000);
        System.out.println("Player pot: " + playerPot);
        System.out.println("Dealer pot: " + dealerPot);
    }
   
}
