package projecteuler;

import java.math.BigInteger;
public class Task48 {
	public static void main(String[] args) {
		BigInteger sum =BigInteger.ZERO;
		for (BigInteger a = BigInteger.ONE; a.compareTo(new BigInteger("1000")) <= 0; a = a.add(BigInteger.ONE)) {
			sum = sum.add(a.pow(a.intValue()));
		}
		String string = String.valueOf(sum);
		System.out.print(string.substring(2991));
	}
}
