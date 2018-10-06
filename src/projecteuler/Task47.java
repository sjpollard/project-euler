package projecteuler;

import java.util.ArrayList;
import java.util.HashSet;

public class Task47 {

	public static void main(String[] args) {
		boolean carry = true;
		ArrayList<ArrayList<Integer>> listOfFactors = new ArrayList<ArrayList<Integer>>();
		for (int i = 2; carry; i++) {
			listOfFactors.add(primeFactors(i));
			if (listOfFactors.size() == 4) { 
				HashSet<Integer> uniqueFactors = new HashSet<Integer>();
				for (ArrayList<Integer> list: listOfFactors) {
					for (int factor: list) { 
						uniqueFactors.add(factor);
					}
				}
				if (uniqueFactors.size() == 16) {
					System.out.println(listOfFactors); 
					carry = false;
				}
				listOfFactors.remove(0);
			}
		}

	}
	
	public static ArrayList<Integer> primeFactors(int num) { 
		int prime = 1;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while (num % 2 == 0) {
			num /= 2;
			prime *= 2;
		}
		if (prime > 1) factors.add(prime);
		for (int i = 3; i <= num && num > 1; i += 2) { 
			if(isPrime(i)) { 
					prime = 1;
					while(num % i == 0) { 
						num /= i;
						prime *= i;
					}
					if(prime > 1) factors.add(prime);
			}
		}
		return factors;
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = false;
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
