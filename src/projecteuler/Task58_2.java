package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task58_2 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(3,5,7,9));
		boolean carry = true;
		int numPrimes = 3;
		int numbers = 5;
		for (int i = 1; carry; i++) { 
			for (int x = 0; x < 4; x++) {
				int num = primes.get(x) + (2 * (x + 1)) + (8 * i);
				if (isPrime(num)) { 
					numPrimes++;
				}
				numbers++;
				primes.set(x, num);
			}
			if ((double)numPrimes / numbers < 0.1) { 
				carry = false;
				System.out.println(numPrimes + " " + numbers);
				System.out.println(3 + i * 2);
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

}
