package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task60 {

    public static void main(String[] args) {

        String[] binary = produceBinary(5);
        ArrayList<String> binarymask = remove(binary);

        for (int a = 2; a <= 10000; a++) {
            for (int b = 2; b <= 10000; b++) {
                for (int c = 2; c <= 10000; c++) {
                    for (int d = 2; d <= 10000; d++) {
                        for (int e = 2; e <= 10000; e++) {
                            if (isPrime(a) && isPrime(b) && isPrime(c) && isPrime(d) && isPrime(e)) {

                                ArrayList<String> numbers = new ArrayList<>(Arrays.asList(String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d), String.valueOf(e)));

                                if (allPrime(binarymask, numbers)) {
                                    System.out.println(a + b + c + d + e);
                                }

                            }
                        }
                    }
                }
            }
            System.out.println(a);
        }

    }

    public static boolean allPrime(ArrayList<String> binary, ArrayList<String> numbers) {

        int count = 0;

        for (String bin: binary) {

            int sum = 0;

            for (int i = 0; i < 5; i++) {

                if (bin.substring(i, i + 1).equals("1")) {

                    sum += Integer.parseInt(bin);

                }

            }

            if (isPrime(sum)) count++;

        }

        if (count == 10) return true;
        else return false;
    }

    public static ArrayList<String> remove(String[] binary) {

        ArrayList<String> newbinary = new ArrayList<>();

        for (String string: binary) {

            int ones = 0;

            for (int i = 0; i < 5; i++) {

                if (string.substring(i, i+1).equals("1")) {
                    ones++;
                }

            }

            if (ones == 2) newbinary.add(string);

        }

        return newbinary;

    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        int factors = 0;
        for (int x = 1; x * x <= num; x++) {
            if (num % x == 0) factors += 2;
            if (factors > 2) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static String[] produceBinary(int length) {

        String[] binary = new String[(int)Math.pow(2, length)];

        for (int i = 0; i < Math.pow(2, length); i++) {

            binary[i] = Integer.toBinaryString(i);
            int currentLength = length - binary[i].length();
            for (int x = 0; x < currentLength; x++) {

                binary[i] = "0" + binary[i];

            }

        }

        return binary;

    }

}
