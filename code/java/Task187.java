package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task187 {

	public static void main(String[] args) {
		primeSieve(1000);
		
	}
	
	public static ArrayList<Integer> primeSieve(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(2));
		for (int i = 3; i <= num; i += 2) { 
			boolean add = true;
			for (int prime : primes) { 
				if (i % prime == 0) { 
					add = false;
					break;
				}
			}
			if (add) { 
				primes.add(i);
			}
		}
		for (int prime: primes) { 
			System.out.println(prime);
		}
		return primes;
			
	}

}
