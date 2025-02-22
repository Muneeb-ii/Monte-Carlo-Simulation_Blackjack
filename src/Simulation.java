/**
 * Author: Muneeb Nafees
 * 
 * Purpose of the class: To simulate different sets of blackjack 
 * games and output the results.
 */

 public class Simulation {

    /**
     * Runs 100, 1000, and 10,000 games of blackjack and prints the percentage of draws, dealer wins, and player wins.
     */
    public static void main(String[] args){
        int dealerWins = 0;
        int playerWins = 0;
        int draws = 0;
        Blackjack game = new Blackjack();

        for (int i = 0; i < 100; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
            } else if (result == -1) {
                dealerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("Results for 100 games of blackjack:");
        System.out.println("Draw percent: " + draws);
        System.out.println("Dealer win percent: " + dealerWins);
        System.out.println("Player win percent: " + playerWins);

        dealerWins = 0;
        playerWins = 0;
        draws = 0;

        for (int i = 0; i < 1000; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
            } else if (result == -1) {
                dealerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("Results for 1000 games of blackjack:");
        System.out.println("Draw percent: " + (draws*100)/ 1000);
        System.out.println("Dealer win percent: " + (dealerWins*100)/ 1000);
        System.out.println("Player win percent: " + (playerWins*100)/ 1000);

        dealerWins = 0;
        playerWins = 0;
        draws = 0;

        for (int i = 0; i < 10000; i++) {
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
            } else if (result == -1) {
                dealerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("Results for 10,000 games of blackjack:");
        System.out.println("Draw percent: " + (draws*100)/ 10000);
        System.out.println("Dealer win percent: " + (dealerWins*100)/ 10000);
        System.out.println("Player win percent: " + (playerWins*100)/ 10000);
    }
   
}
