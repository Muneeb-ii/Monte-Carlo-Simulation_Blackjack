/*
file name:      DeckTests.java
Authors:        Max Bender & Naser Al Madi
last modified:  8/28/2022

How to run:     java -ea DeckTests
*/


public class DeckTests {

    public static void deckTests() {

        // case 1: testing Deck() and size()
        {
            // set up
            Deck d1 = new Deck();

            // verify
            System.out.println(d1);

            // test
            assert d1 != null : "Error in Deck::Deck()";
            assert d1.size() == 52 : "Error in Deck::Deck()";
        }

        // case 2: testing deal()
        {
            // set up
            Deck d1 = new Deck();

            // verify

            // test
            Card c1 = d1.deal();

            assert d1 != null : "Error in Deck::deal()";
            assert c1 != null : "Error in Deck::deal()";
            assert d1.size() == 51 : "Error in Deck::deal()";
        }

        // case 3: testing build()
        {
            // set up
            Deck d1 = new Deck();

            // verify

            // test
            Card c1 = d1.deal();
            Card c2 = d1.deal();
            Card c3 = d1.deal();
            d1.build();

            assert d1 != null : "Error in Deck::build()";
            assert c1 != null : "Error in Deck::deal()";
            assert c2 != null : "Error in Deck::deal()";
            assert c3 != null : "Error in Deck::deal()";
            assert d1.size() == 52 : "Error in Deck::build()";
        }

        // case 4: testing shuffle()
        {
            // set up
            Deck d1 = new Deck();

            // verify
            

            // test
            String before = d1.toString();
            d1.shuffle();
            String after = d1.toString();

            assert !before.equals(after) : "Error in Deck::shuffle()";
            assert d1.size() == 52 : "Error in Deck::shuffle()";
        }

        // case 5: testing correct number of each card
        {
            // set up
            Deck d1 = new Deck();

            // verify


             // test
            int[] cardCount = new int[11];
            for (int i = 0; i < 11; i++) {
                cardCount[i] = 0;
            }
           
            for (int i = 0; i < 52; i++) {
                Card c = d1.deal();
                cardCount[c.getValue()-1]++;
            }

            for (int i = 1; i < 8; i++) {
                assert cardCount[i] == 4 : "Error in Deck::Deck()"; // 4 2s - 8s
            }
            
            assert cardCount[0] == 0 : "Error in Deck::Deck()"; // 0 1s
            assert cardCount[9] == 16 : "Error in Deck::Deck()"; // 16 10s
            assert cardCount[10] == 4 : "Error in Deck::Deck()"; // 4 11s
        }
    
        
        // case 6: testing reshuffle randomness
        {
            // set up
            Deck d1 = new Deck();

            // verify
            

            // test
            String before = d1.toString();
            d1.shuffle();
            String after = d1.toString();
            d1.shuffle();
            String after2 = d1.toString();

            assert !before.equals(after) : "Error in Deck::shuffle()"; // check that shuffle is random
            assert !before.equals(after2) : "Error in Deck::shuffle()"; // check that reshuffle is random
            assert !after.equals(after2) : "Error in Deck::shuffle()"; // check that reshuffle is random
            assert d1.size() == 52 : "Error in Deck::shuffle()"; // check that deck size is maintained
        }
        System.out.println("*** Done testing Deck! ***\n");
    }


    public static void main(String[] args) {

        deckTests();
    }
}