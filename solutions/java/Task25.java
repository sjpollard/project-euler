package projecteuler;

import java.math.BigInteger;

public class Task25 {
	public static void main(String[] args) {
		BigInteger fib = BigInteger.ZERO;
		BigInteger fib1 = BigInteger.ONE;
		BigInteger fib2 = BigInteger.ONE;
		int i;
		for(i = 2; String.valueOf(fib).length() < 1000; i++) {
			fib = fib1.add(fib2);
			fib1 = fib2;
			fib2 = fib;;
		}
		System.out.print(i);
	}
}
