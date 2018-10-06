package projecteuler;

import java.util.ArrayList;

public class Task52 {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		boolean carry = true;
		int product, count;
		product = count = 0;
		for (int i = 1; carry; i++) { 
			product = 1;
			count = 0;
			for (int coeff = 2; coeff <= 6; coeff++) { 
				if (isPandigital(String.valueOf(i), String.valueOf(i * coeff))) { 
					count++;
				}
			}
			if (count == 5) { 
				System.out.println(i);
				carry = false;
			}
		}
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );

	}
	
	public static boolean isPandigital(String first, String second) {
		boolean isPandigital = false;
		ArrayList<String> firstlist = new ArrayList<String>();
		for (int i = 0; i < first.length(); i++) { 
			firstlist.add(String.valueOf(first.charAt(i)));
		}
		ArrayList<String> secondlist = new ArrayList<String>();
		for (int i = 0; i < second.length(); i++) { 
			secondlist.add(String.valueOf(second.charAt(i)));
		}
		if (firstlist.containsAll(secondlist) && secondlist.containsAll(firstlist)) { 
			isPandigital = true;
		}
		return isPandigital;
	}

}
