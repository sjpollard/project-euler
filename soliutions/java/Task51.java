package projecteuler;

import java.util.ArrayList;

public class Task51 {

    public static void main(String[] args) {

        boolean carry = true;
        for (int i = 56003; carry; i += 2) {

            if (isPrime(i)) {

                String num = String.valueOf(i);
                String[] binary = produceBinary(num.length());

                for (String map: binary) {

                    ArrayList<Integer> primes = new ArrayList<>();

                    for (int x = 0; x < 10; x++) {


                        int newNum = Integer.parseInt(replaceDigits(map, num, x));
                        if (isPrime(newNum) && String.valueOf(newNum).length() == num.length()) {

                            primes.add(newNum);

                        }

                    }

                    if (primes.size() == 8) {
                        for (int a: primes) {
                            System.out.println(a);
                        }
                        System.out.println();
                    }

                }

            }

        }

    }

    public static String replaceDigits(String map, String num, int replacement) {

        String out = "";

        for (int i = 0; i < map.length(); i++) {

            if (map.substring(i, i + 1).equals("1")) {

                out += String.valueOf(replacement);

            }
            else {

                out += num.substring(i, i + 1);

            }

        }

        return out;

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

}