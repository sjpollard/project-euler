package projecteuler;

public class Task51 {

	public static void main(String[] args) {
		boolean carry = true;
		for (int i = 56003; carry; i += 2) { 
			if (isPrime(i)) { 
				
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
