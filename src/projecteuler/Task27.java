package projecteuler;

public class Task27 {
	public static void main(String args[]) {
		int largePrimeCount, prodCo;
		largePrimeCount = prodCo = 0;
		for (int a = -999; a < 1000; a++) { 
			for (int b = -999; b <= 1000; b++) { 
				int primeCount = 0;
				boolean carry = true;
				for (int i = 1; carry; i++) {
					int result = i * i + a * i + b;
					if (isPrime(Math.abs(result))) primeCount++;
					if (!(primeCount == i)) carry = false;
					if (primeCount > largePrimeCount) {
						largePrimeCount = primeCount;
						prodCo = a * b;
						
					}
				}
			}
		}
		System.out.print(prodCo);
	}
	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 1; i * i <= num; i++) { 
			if (num % i == 0 && !(i == 1)) prime = false;
		}
		return prime; 
	}
}
