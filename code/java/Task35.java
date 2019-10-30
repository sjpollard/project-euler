package projecteuler;

public class Task35 {
	public static void main(String[] args) {
		int count = 1;
		int primes = 0;
		for (int x = 3; x < 1000000; x += 2) {
			if (isPrime(x)) {
				primes = 0;
				for (String num : rotate(String.valueOf(x))) {
					if(isPrime(Integer.parseInt(num))) primes++;
				}
				if (primes == String.valueOf(x).length()) count++;
			}
		}
		System.out.print(count);
	}

	public static String[] rotate(String num) {
		int length = String.valueOf(num).length();
		String rotations[] = new String[length];
		rotations[0] = num;
		if (length == 1)
			return rotations;
		for (int x = 1; x < length; x++) {
			char end = rotations[x - 1].charAt(length - 1);
			String rest = rotations[x - 1].substring(0, length - 1);
			rotations[x] = end + rest;
		}
		return rotations;
	}

	public static boolean isPrime(int num) {
		boolean isPrime = false;
		int factors = 0;
		for (int x = 1; x * x <= num; x++) {
			if (num % x == 0)
				factors += 2;
		}
		if (factors == 2) {
			isPrime = true;
		}
		return isPrime;
	}
}