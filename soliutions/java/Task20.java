package projecteuler;

import java.math.BigInteger;

public class Task20 {
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger fact = BigInteger.ONE;
		for (BigInteger num = new BigInteger("1"); num.compareTo(new BigInteger("100")) <= 0; num = num.add(BigInteger.ONE)) {
			fact = fact.multiply(num);
		}
		String factS = String.valueOf(fact);
		for (int i = 0; i < factS.length(); i++) {
			sum = sum.add(new BigInteger(factS.substring(i, i + 1)));
		}
		System.out.print(sum);
	}
}