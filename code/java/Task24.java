package projecteuler;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to find permutations of: ");
		String string = sc.nextLine();
		SortedSet<String> numbers = new TreeSet<String>(Arrays.asList(string.substring(0, 1)));
		SortedSet<String> tempnumbers = new TreeSet<String>();
		for(int count = 1; count < string.length(); count++) { 
			String newDigit = string.substring(count, count + 1);
			for (String num: numbers) { 
				for (int newlocation = 0; newlocation < num.length() + 1; newlocation++) { 
					allocate(num, newlocation, newDigit, tempnumbers);
				}
			}
			numbers = new TreeSet<String>(tempnumbers);
			tempnumbers.clear();
		}
		System.out.println(numbers.size());
		for (String word: numbers) {System.out.print(word + "\n");};
		sc.close();
	}
	public static void allocate(String num, int newlocation, String newDigit, SortedSet<String> tempnumbers) { 
		String newnum = "";
		boolean allocated = false;
		for (int position = 0; newnum.length() < num.length() + 1 ; position++) { 
			if (position == newlocation && !(allocated)) { 
				newnum += newDigit;
				allocated = true;
				position--;
			}
			else { 
				newnum += "" + num.charAt(position);
			}
		}
		tempnumbers.add(newnum);
	}
}