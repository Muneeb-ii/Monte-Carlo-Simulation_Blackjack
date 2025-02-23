/**
 * Author: Muneeb Nafees
 * 
 * Purpose of the class: To calculate the standard deviation of 15 
 * simulations of 100, 1000, and 10000 games of blackjack.
 */

public class StandardDeviation {

    /**
     * Runs 15 simulations of 100, 1000, and 10000 games of blackjack and calculates the standard deviation of the simulations.
     */
    public static void main(String[] args){
        double playerWins;
        double[] hundrenGamesSimulations = new double[15];
        double[] thousandGamesSimulations = new double[15];
        double[] tenThousandGamesSimulations = new double[15];

        Blackjack game = new Blackjack();
        
        for(int j=0; j<15; j++){
            playerWins = 0.0;
            for (int i = 0; i < 100; i++) {
                int result = game.game(false);
                if (result == 1) {
                    playerWins++;
                } 
            }
            hundrenGamesSimulations[j] = playerWins;
        }

        calculateStandardDeviation(hundrenGamesSimulations); // Standard deviation of 100 games

        for(int j=0; j<15; j++){
            playerWins = 0.0;

            for (int i = 0; i < 1000; i++) {
                int result = game.game(false);
                if (result == 1) {
                    playerWins++;
                } 
            }
            thousandGamesSimulations[j] = playerWins;
        }

        calculateStandardDeviation(thousandGamesSimulations); // Standard deviation of 1000 games

        for(int j=0; j<15; j++){
            playerWins = 0.0;

            for (int i = 0; i < 10000; i++) {
                int result = game.game(false);
                if (result == 1) {
                    playerWins++;
                } 
            }
            tenThousandGamesSimulations[j] = playerWins;
        }

        calculateStandardDeviation(tenThousandGamesSimulations); // Standard deviation of 10000 games  
    }

    /**
     * Calculates the standard deviation of the simulations.
     * @param simulations
     * @return standard deviation of the simulations
     */
    public static void calculateStandardDeviation(double[] simulations){
        double sum = 0.0;
        double mean = 0.0;
        for(double wins : simulations){
            mean += wins;
        }
        mean = mean / 15;
        for(double wins : simulations){
            sum += Math.pow(wins - mean, 2);
        }
        System.out.println(Math.sqrt(sum / 15));
    }
}
