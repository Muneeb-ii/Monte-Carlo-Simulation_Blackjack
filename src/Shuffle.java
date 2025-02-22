/**
* Author: Muneeb Nafees
* 
* Purpose of the class: This class demonstrates how to shuffle an 
* ArrayList by randomly removing elements from the list.
*/

import java.util.Random;

public class Shuffle {
    public static void main (String[] args) {

        ArrayList<Integer> arr0 = new ArrayList<>();
        Random randomizer = new Random();

        for(int i=0; i<10; i++){
            arr0.add(randomizer.nextInt(100));
            System.out.println(arr0.get(i));
        }
        for(int i=0; i<10; i++){
            System.out.println(arr0.get(i));
        }

        for(int i=0; i<10; i++){
            int indexToRemove = randomizer.nextInt(arr0.size());
            System.out.print(arr0.get(indexToRemove) + " ");
            arr0.remove(indexToRemove);
            
            for(int j=0; j<arr0.size(); j++){
                System.out.print(arr0.get(j) + " ");
            }
            System.out.println();
        }
    }
}
