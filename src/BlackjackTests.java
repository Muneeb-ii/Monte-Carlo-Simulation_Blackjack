/*
file name:      BlackjackTests.java
Authors:        Max Bender & Naser Al Madi
last modified:  8/28/2022

How to run:     java -ea BlackjackTests
*/

//Expected results:
//Draw percent: 8 +/- 1
//Dealer win percent: 49 +/- 1
//Player win percent: 41 +/- 1


public class BlackjackTests {

    /**
     * Runs 10000 games of blackjack and prints the percentage of draws, dealer wins, and player wins.
     */

    public static void blackjackTests() {

        int dealerWins = 0;
        int playerWins = 0;
        int draws = 0;

        for (int i = 0; i < 10000; i++) {
            Blackjack game = new Blackjack();
            int result = game.game(false);
            if (result == 1) {
                playerWins++;
            } else if (result == -1) {
                dealerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("Draw percent: " + (draws*100)/ 10000);
        System.out.println("Dealer win percent: " + (dealerWins*100)/ 10000);
        System.out.println("Player win percent: " + (playerWins*100)/ 10000);

    }

    public static void main(String[] args) {

        blackjackTests();
    }
}