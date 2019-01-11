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
        System.out.println(isFullHouse(new ArrayList<>(Arrays.asList("2C", "3D", "3S", "9S", "9D"))));

    }

    public static int winner(ArrayList<String> cards1, ArrayList<String> cards2) {

        int score1 = score(cards1);
        int score2 = score(cards2);

        if (score1 > 14 && score2 > 14) {
            if (score1 > score2) return 1;
            return 2;
        }

        if (score1 > 14 && score2 < 15) {
            return 2;
        }

        if (score1 < 15 && score2 > 14) {
            return 1;
        }

        

        if (score1 == score2) {

            if (highCard(cards1) > highCard(cards2)) return 1;
            else return 2;



        }

    }

    public static int score(ArrayList<String> cards) {

        if (isRoyalFlush(cards) == 10) return 10;
        if (isStraightFlush(cards) == 9) return 9;
        if (isFourOfAKind(cards) == 8) return 8;
        if (isFullHouse(cards) == 7) return 7;
        if (isFlush(cards) == 6) return 6;
        if (isStraight(cards) == 5) return 5;
        if (isThreeOfAKind(cards) == 3) return 4;
        if (isTwoPair(cards) == 2) return 2;
        if (isOnePair(cards) == 1) return 1;
        else return 100 + highCard(cards);
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

    public static int isFullHouse(ArrayList<String> cards) {

        int i = 0;
        ArrayList<Integer> indexes = new ArrayList<>();
        for (String card: cards) {

            i = 0;
            for (String card2: cards) {

                if (card.substring(0,1).equals(card2.substring(0,1 ))) i++;
                indexes.add(cards.indexOf(card2));

            }
            if (i == 3) break;

        }

        if (i == 3) {
            ArrayList<String> clone = new ArrayList<>();
            for (String item: cards) clone.add(item);
            int index1 = indexes.get(0);
            int index2 = indexes.get(1);
            clone.remove(index1);
            if (index2 > index1) index2--;
            clone.remove(index2);
            if (isOnePair(clone) == 2) return 7;
        }

        return 0;

    }

    public static int isFlush(ArrayList<String> cards) {

        int i = 0;
        String letter = cards.get(0).substring(1,2);
        for (String card: cards) {

            if (card.substring(1,2).equals(letter)) i++;

        }
        if (i == 5) return 6;
        else return 0;

    }

    public static int isStraight(ArrayList<String> cards) {

        SortedSet<Integer> values = new TreeSet<>();

        for (String card: cards) {

            if (card.substring(0, 1).equals("T")) values.add(10);
            else if (card.substring(0,1).equals("J")) values.add(11);
            else if (card.substring(0,1).equals("Q")) values.add(12);
            else if (card.substring(0,1).equals("K")) values.add(13);
            else if (card.substring(0,1).equals("A")) values.add(14);
            else values.add(Integer.parseInt(card.substring(0,1)));

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

            return 5;

        }

        return 0;

    }

    public static int isThreeOfAKind(ArrayList<String> cards) {

        int i = 0;
        for (String card: cards) {

            i = 0;
            for (String card2: cards) {

                if (card.substring(0,1).equals(card2.substring(0,1 ))) i++;

            }
            if (i == 3) return 4;

        }

        return 0;

    }

    public static int isTwoPair(ArrayList<String> cards) {

        int i = 0;
        int index1 = 0;
        int index2 = 0;
        for (String card: cards) {

            i = 0;
            for (String card2: cards) {

                if (card.substring(0,1).equals(card2.substring(0,1 )))  {
                    index1 = cards.indexOf(card);
                    index2 = cards.indexOf(card2);
                    i++;
                }

            }
            if (i == 2) {
                break;
            }

        }
        if (i == 2) {
            ArrayList<String> clone = new ArrayList<>();
            for (String item: cards) clone.add(item);
            clone.remove(index1);
            if (index2 > index1) index2--;
            clone.remove(index2);
            if (isOnePair(clone) == 2) return 3;
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
