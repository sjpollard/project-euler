package projecteuler;

import java.io.*;
import java.util.*;

public class Task54 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src\\projecteuler\\p054_poker.txt")));

        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {

            String hand1 = line.substring(0,14);
            String hand2 = line.substring(15, 29);

            ArrayList<String> cards1 = new ArrayList<>(Arrays.asList(hand1.split(" ")));
            ArrayList<String> cards2 = new ArrayList<>(Arrays.asList(hand2.split(" ")));

        }
        System.out.println(isOnePair(new ArrayList<>(Arrays.asList("9S", "9H", "9C", "3D", "KS"))));

    }

    public static int isRoyalFlush(ArrayList<String> cards) {

        String letter = cards.get(0).substring(1,2);

        ArrayList<String> flush = new ArrayList<>(Arrays.asList("T", "J", "Q", "K", "A"));

        for (String card: cards) {

            Iterator<String> iter = flush.iterator();

            while (iter.hasNext()) {
                String token = iter.next();

                if (card.matches(token + ".{1}")) {

                    if (letter.equals(card.substring(1,2))) {
                        iter.remove();
                    }
                    else {
                        break;
                    }

                }

            }

        }

        if (flush.size() == 0) {
            return 10;
        }
        else {
            return 0;
        }

    }

    public static int isStraightFlush(ArrayList<String> cards) {

        SortedSet<Integer> values = new TreeSet<>();
        String letter = cards.get(0).substring(1, 2);
        for (String card: cards) {

            if (!card.substring(1,2).equals(letter)) {
                return 0;
            }
            else {
                if (card.substring(0, 1).equals("T")) values.add(10);
                else if (card.substring(0,1).equals("J")) values.add(11);
                else if (card.substring(0,1).equals("Q")) values.add(12);
                else if (card.substring(0,1).equals("K")) values.add(13);
                else if (card.substring(0,1).equals("A")) values.add(14);
                else values.add(Integer.parseInt(card.substring(0,1)));

            }

        }

        if (values.size() == 5) {

            int a = values.first();
            values.remove(a);
            for (Integer num: values) {

                if (a + 1 == num) {

                    a = num;

                }
                else return 0;

            }

            return 9;

        }

        return 0;

    }

    public static int isFourOfAKind(ArrayList<String> cards) {

        int i = 0;
        for (String card: cards) {

            i = 0;

            for (String card2: cards) {

                if (card.substring(0,1 ).equals(card2.substring(0,1))) i++;

            }

            if (i == 4) return 8;

        }

        return 0;

    }

    /*public static int isFullHouse(ArrayList<String> cards) {

           return 7;

    }*/

    public static int isTwoPair(ArrayList<String> cards) {

        int i = 0;
        int index = 0;
        for (String card: cards) {

            i = 0;
            for (String card2: cards) {

                index = cards.indexOf(card2);
                if (card.substring(0,1).equals(card2.substring(0,1 ))) i++;

            }
            if (i == 2) {
                ArrayList<String> clone;
                //for (String item: cards) clone.add(item);
                cards.remove(card);
                cards.remove(index);
                //if (isOnePair(cards))
            }

        }

        return 0;

    }

    public static int isOnePair(ArrayList<String> cards) {

        int i = 0;
        for (String card: cards) {

            i = 0;
            for (String card2: cards) {

                if (card.substring(0,1).equals(card2.substring(0,1 ))) i++;

            }
            if (i == 2) return 2;

        }

        return 0;

    }

    public static int highCard(ArrayList<String> cards) {

        ArrayList<Integer> values = new ArrayList<>();
        for (String card: cards) {

                if (card.substring(0, 1).equals("T")) values.add(10);
                else if (card.substring(0,1).equals("J")) values.add(11);
                else if (card.substring(0,1).equals("Q")) values.add(12);
                else if (card.substring(0,1).equals("K")) values.add(13);
                else if (card.substring(0,1).equals("A")) values.add(14);
                else values.add(Integer.parseInt(card.substring(0,1)));

        }

        int largest = 0;

        for (int card: values) {

            if (card > largest) largest = card;

        }

        return largest;

    }

}
