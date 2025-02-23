# Monte-Carlo Simulation: Blackjack

This project implements a Monte Carlo simulation of a simplified Blackjack game using Java. The primary goal of the project is to study the statistical properties of Blackjack, given a specific rule set, by simulating thousands of hands. This project was developed as part of a CS Data Structures and Algorithms course and uses an ArrayList implementation from lab.

## Project Overview

### Core Components
- Card Class: Represents a playing card with a value (ranging from 2-11, with 11 representing an Ace by default).
- Hand Class: Represents a collection of cards (using an ArrayList) and includes methods to add cards, calculate total hand value, and display the hand.
- Deck Class: Manages a deck of 52 cards (with the appropriate counts per value), provides a method for shuffling, and deals cards.
- Blackjack Class: Implements the game logic:
  - Deals two cards to both the player and the dealer.
  - The player draws cards until reaching a total of at least 16.
  - The dealer draws until reaching at least 17.
  - A bust (total > 21) immediately results in a win for the other party.
  - A natural Blackjack (a two-card 21) beats any 21 formed by more than two cards.
  - The deck is rebuilt and shuffled when fewer than 26 cards remain.
  - Contains a game(`boolean verbose`) method that plays one complete game.

### Simulation and Testing
- Simulation Class: Automates multiple rounds of Blackjack to calculate outcome statistics (player wins, dealer wins, draws) over 100, 1,000, and 10,000 games.
- StandardDeviation Class (Extension 3): Runs 15 simulations for each game count (100, 1,000, 10,000 games) and calculates both the absolute and relative standard deviation of the player win counts, illustrating how variability stabilizes as the number of games increases.

## Extensions

### Flexible Ace Rule and Natural Blackjack Check
- What I Did:
	  •	Modified the game logic so that an Ace (normally 11) can be downgraded to 1 if a hand would otherwise bust.
	  •	Added a check to identify a natural Blackjack (a two-card 21) which beats a 21 made up of more than two cards.
- Why:
	  •	To more closely mimic the real rules of Blackjack and study how this rule change affects game outcomes.
- Outcome:
    • Simulation results remained largely similar, but the handling of Aces reduced bust scenarios and clarified win conditions for natural Blackjacks.

### Betting Strategy Extension
- What I Did:
  - Introduced a betting strategy in the simulation. Both the player and dealer start with a $200 pot.
  - In each game, both sides bet half of their current pot. The winner takes both bets.
  - This dynamic allows a player to potentially profit even if they win fewer games overall.
- Outcome:
  - Simulation results showed variable pot sizes across simulations. For example:
    - First Simulation (100 games): Player pot ≈ $347.57, Dealer pot ≈ $52.42.
    - First Simulation (1,000 games): Player pot ≈ $96.38, Dealer pot ≈ $303.62.
    - First Simulation (10,000 games): Player pot ≈ $244.94, Dealer pot ≈ $155.06.
  - These results indicate that the sequence of wins and losses (and thus the size of bets) significantly affects final earnings.

### Standard Deviation Analysis Extension
- What I Did:
  - Ran 15 independent simulations for 100, 1,000, and 10,000 games to record player wins.
  - Calculated both the absolute standard deviation and the relative standard deviation (coefficient of variation) of the win counts.
- Why:
  - To understand how variability in outcomes changes with the number of games played and to confirm that, while absolute variability increases, the relative variability (win rate) becomes more stable.
- Outcome:
  - 100 games: Absolute SD ≈ 5.81 wins, Relative SD ≈ 12.69%.
  - 1,000 games: Absolute SD ≈ 15.06 wins, Relative SD ≈ 3.58%.
  - 10,000 games: Absolute SD ≈ 50.82 wins, Relative SD ≈ 1.22%.
  - The relative standard deviation decreases as the number of games increases, indicating that win percentages stabilize with larger samples, in line with the Law of Large Numbers.

## How to Run the Project

### 1.	Clone the Repository:

`git clone https://github.com/Muneeb-ii/Monte-Carlo-Simulation_Blackjack.git
cd Monte-Carlo-Simulation_Blackjack`


### 2.	Compile the Code:
Ensure you have Java installed. Compile all Java files:

`javac *.java`


### 3.	Run the Game:
To play a single game of Blackjack:

`java Blackjack`

To generate simulation results:

`java Simulation`

To run the standard deviation analysis:

`java StandardDeviation`



## Results and Observations
- The simulation outputs detailed game outcome statistics (win/draw percentages) for various game counts.
- Despite modifications (such as the flexible Ace rule and betting strategy), the dealer retains a slight edge—a reflection of real-world casino Blackjack.
- Standard deviation analysis confirms that while absolute variability increases with more games, the relative variability decreases, meaning the win rate becomes more stable.

## Conclusion

This project not only reinforces object-oriented design and Monte Carlo simulation concepts but also provides practical insights into the statistical properties of Blackjack under different rule sets and betting strategies. Extensions such as flexible Ace values, natural Blackjack checks, and betting strategies have been explored, and their effects have been quantified through extensive simulations.
