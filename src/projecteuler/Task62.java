package projecteuler;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task62 {

	public static void main(String[] args) {
		boolean carry = true;
		for (long i = 5027L; carry; i++) { 
			int count = 0;
			String cube = String.valueOf(i * i * i);
			SortedSet<String> numbers = permutations(cube);
			for (String num: numbers) { 
				double root = Math.pow(Double.parseDouble(num) , 1.0/3.0);
				long rounded = Math.round(root);
				if (Math.abs(rounded - root) <= 0.000000001) { 
					if (Math.round(root) % 1 == 0) { 
						count++;
					}
				}
			}
			System.out.println(count);
			if (count == 5) { 
				carry = false;
				System.out.println(i);
			}
		}
	}

	public static SortedSet<String> permutations(String string) {
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
		return numbers;
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
