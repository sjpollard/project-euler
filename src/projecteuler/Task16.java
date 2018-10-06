package projecteuler;

import java.math.*;

public class Task16 {
	public static void main(String[] args) {
		int z = 0;
		BigInteger a = null;
		BigInteger b = null;
		BigInteger total = new BigInteger("0");
		BigInteger temp = null;
		double x = Math.pow(2, 1000);
		BigInteger y = new BigDecimal(x).toBigIntegerExact();
		System.out.print(y);
		int length = ("" + y).length();
		System.out.print("\n" + length);
		for (int i = 1; i <= (length); i++) {
			a = new BigDecimal(Math.pow(10, i)).toBigIntegerExact();
			b = new BigDecimal(Math.pow(10, i - 1)).toBigIntegerExact();
			temp = (((y.mod(a)).divide(b)));
			total = total.add(temp);
			z = (total).intValue();
		}
		System.out.print("\n" + z);
	}
}
