package projecteuler;

import java.util.ArrayList;

public class Task49 {
	public static void main(String[] args) {
		for (int i = 1001; i <= 3340; i += 2) { 
			if (isPrime(i) && isPrime(i + 3330) && isPrime(i + 6660)) { 
				if (isPandigital(String.valueOf(i), String.valueOf(i + 3330)) && isPandigital(String.valueOf(i), String.valueOf(i + 6660))) { 
					System.out.println(i+""+(i+3330)+""+(i+6660));
				}
			}
		}
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