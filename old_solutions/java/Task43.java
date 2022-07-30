package projecteuler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task43 {
	public static void main(String[] args) {
		String string = "0123456789";
		SortedSet<String> numbers = new TreeSet<String>(Arrays.asList(string.substring(0, 1)));
		SortedSet<String> tempnumbers = new TreeSet<String>();
		for (int count = 1; count < string.length(); count++) {
			String newDigit = string.substring(count, count + 1);
			for (String num : numbers) {
				for (int newlocation = 0; newlocation < num.length() + 1; newlocation++) {
					allocate(num, newlocation, newDigit, tempnumbers);
				}
			}
			numbers = new TreeSet<String>(tempnumbers);
			tempnumbers.clear();
		}
		BigInteger sum = BigInteger.ZERO;
		for (String number : numbers) {
			if (!(number.charAt(0) == (char) 48)) {
				if (subDivisibilty(number)) {
					sum = sum.add(new BigInteger(number));
				}
			}
		}
		System.out.println(sum);
	}

	public static boolean subDivisibilty(String num) {
		int count = 0;
		int primes[] = { 2, 3, 5, 7, 11, 13, 17 };
		boolean subDivisible = false;
		int substring = 0;
		char list[] = num.toCharArray();
		for (int i = 1; i < list.length - 2; i++) {
			substring = Integer.parseInt(String.valueOf(list[i]) + String.valueOf(list[i + 1]) + String.valueOf(list[i + 2]));
			if (substring % primes[i - 1] == 0) {
				count++;
			}
		}
		if (count == 7)
			subDivisible = true;
		return subDivisible;
	}

	public static void allocate(String num, int newlocation, String newDigit, SortedSet<String> tempnumbers) {
		String newnum = "";
		boolean allocated = false;
		for (int position = 0; newnum.length() < num.length() + 1; position++) {
			if (position == newlocation && !(allocated)) {
				newnum += newDigit;
				allocated = true;
				position--;
			} else {
				newnum += "" + num.charAt(position);
			}
		}
		tempnumbers.add(newnum);
	}
}