package projecteuler;

public class Task46 {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		boolean carry = true;
		for (int i = 1; carry; i += 2) { 
			if (!isPrime(i) && !isGoldbach(i)) { 
				System.out.println(i);
				carry = false;
			}
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );

	}
	
	public static boolean isGoldbach(int num) { 
		boolean isGoldbach = false;
		for (int prime = 2; prime < num; prime++) { 
			if (isPrime(prime)) {
					int nextNum = num - prime;
					if (nextNum % 2 == 0) { 
						if (isSquare((nextNum / 2))) { 
							isGoldbach = true;
						}	
					}
			}
		}
		return isGoldbach;
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
	
	public static boolean isSquare(int num) { 
		boolean isSquare = false;
		if (Math.sqrt(num) % 1 == 0) isSquare = true;
		return isSquare;
	}

}
