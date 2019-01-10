package projecteuler;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task54 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src\\projecteuler\\p054_poker.txt")));

        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {

            String hand1 = line.substring(0,14);
            String hand2 = line.substring(15, 29);

            ArrayList<String> cards1 = new ArrayList<>(Arrays.asList(hand1.split(" ")));
            ArrayList<String> cards2 = new ArrayList<>(Arrays.asList(hand2.split(" ")));



        }

    }

    public static int isRoyalFlush(ArrayList<String> cards) {

        ArrayList<String> flush = new ArrayList<>(Arrays.asList("10", "J", "Q", "K", "A"));
        
        for (String card: cards) {
            
            for (String token: flush) {
                
                if (card.matches(flush + ""))
                
            }
            
        }

    }

}
