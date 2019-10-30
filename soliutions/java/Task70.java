package projecteuler;

import java.util.ArrayList;
import java.util.Collections;

public class Task70 {

	public static void main(String[] args) {
		int ans = 0;
		double small = 1000;
		int totient = 0;
		double ntotient = 0;
		int x = 1;
		for (int i = 1; i < 10000000; i += 2) {
			totient = eulersTotient(i);
			ntotient = (double) i / eulersTotient(i);
			if (isPermutation(String.valueOf(i), String.valueOf(totient))) { 
				if (ntotient < small) { 
					System.out.println(i  + " " + totient + " " + ntotient);
					small = ntotient;
					ans = i;
				}
			}
		}
	}

	public static boolean isPermutation(String first, String second) {
		boolean isPermutation = false;
		ArrayList<String> firstlist = new ArrayList<String>();
		ArrayList<String> secondlist = new ArrayList<String>();
		for (int i = 0; i < first.length(); i++) { 
			firstlist.add(String.valueOf(first.charAt(i)));
		}
		for (int i = 0; i < second.length(); i++) { 
			secondlist.add(String.valueOf(second.charAt(i)));
		}
		Collections.sort(firstlist);
		Collections.sort(secondlist);
		if (firstlist.equals(secondlist)) { 
			isPermutation = true;
		}
		return isPermutation;
	}

	public static int eulersTotient(int n) {
		int totient = 0;
		for (int i = 1; i < n; i++) {
			if (gcd(n, i) == 1) {
				totient++;
			}
		}
		return totient;
	}

	public static int gcd(int a, int b) {
		int dividend = a;
		int divisor = b;
		int remainder = 0;
		while (!(divisor == 0)) {
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
	}

	

}
