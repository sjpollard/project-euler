package projecteuler;

import java.math.BigInteger;

public class Task63 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ONE;
		for (BigInteger i = new BigInteger("2"); i.compareTo(new BigInteger("9")) <= 0; i = i.add(BigInteger.ONE)) { 
			for (int exp = 1; exp <= 21; exp++) { 
				BigInteger number = i.pow(exp);
				if (String.valueOf(number).length() == exp) { 
					sum = sum.add(BigInteger.ONE);
					System.out.println(i + " to the power of " + exp + " is " + number);
				}
			}
		}
		System.out.println(sum);
	}
}
