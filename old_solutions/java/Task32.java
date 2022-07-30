package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task32 {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		for (long a = 1L; a <= 48; a++) {
			for (long b = 1L; b <= 1963; b++) {
				long c = a * b;
				String number = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
				if (number.length() == 9) {
					if (isPandigital(number)) {
						if (!products.contains(String.valueOf(c))) {
							products.add(String.valueOf(c));
							System.out.print(a  + " " + b + " " + c + "\n");
						}
					}
				}
			}
		}
		long sum = 0;
		for (String num : products) {
			sum += Long.valueOf(num);
		}
		System.out.println(sum);
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
