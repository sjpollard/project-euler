package projecteuler;

import java.util.ArrayList;

public class Task41 {

	public static void main(String[] args) {
		long largest = 0;
		for (long num = 3L; num < 10000000; num += 2) {
			if (isPrime((int)num)) {
				if (isPandigital(String.valueOf(num))) { 
					if (num > largest) { 
						largest = num;
					}
				}
					
			}
		}
		System.out.println(largest);
	}

	public static boolean isPandigital(String num) {
		ArrayList<String> digits = new ArrayList<String>();
		int length = num.length();
		for (int i = 1; i <= length; i++) {
			digits.add(String.valueOf(i));
		}
		ArrayList<String> listOfDigits = new ArrayList<String>();
		for (int digit = 0; digit < num.length(); digit++) {
			listOfDigits.add(String.valueOf(num.charAt(digit)));
		}
		if (listOfDigits.containsAll(digits)) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int num) {
		boolean isPrime = false;
		int factors = 0;
		for (int x = 1; x * x <= num; x++) {
			if (num % x == 0)
				factors += 2;
		}
		if (factors == 2) {
			isPrime = true;
		}
		return isPrime;
	}

}
