package projecteuler;

import java.math.BigInteger;

public class Task53 {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		int count = 0;
		for (int n = 9; n <= 100; n++) { 
			for (int r = 4; r <= n; r++) { 
				if (nCr(n, r).compareTo(new BigInteger("1000000")) > 0) {
					 count++;
				}
			}
		}
		System.out.println(count);
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );
	}
	
	public static BigInteger nCr(int n, int r) { 
		BigInteger combinations = BigInteger.ZERO;
		BigInteger nFact = factorial(n);
		BigInteger rFact = factorial(r);
		combinations = nFact.divide(rFact.multiply(factorial(n - r)));
		return combinations;
	}
	
	public static BigInteger factorial(int num) { 
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= num; i++) { 
			factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
		}
		return factorial;
	}

}
