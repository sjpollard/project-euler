package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task38 {
	public static void main(String[] args) {
		String answer = "";
		for (long number = 1L; number < 1000000; number++) {
			String pandigital = "";
			for (int x = 1; x < 10; x++) {
				pandigital += String.valueOf(number * x);
				if (pandigital.length() == 9) {
					if (isPandigital(pandigital)) {
						answer = pandigital;
					}
				}
			}
		}
		System.out.print(answer);
	}

	public static boolean isPandigital(String num) {
		ArrayList<String> onetonine = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
		ArrayList<String> listOfDigits = new ArrayList<String>();
		for (int digit = 0; digit < num.length(); digit++) {
			listOfDigits.add(String.valueOf(num.charAt(digit)));
		}
		if (listOfDigits.containsAll(onetonine)) {
			return true;
		}
		return false;
	}
}
