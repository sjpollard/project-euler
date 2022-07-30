package projecteuler;

import java.math.BigInteger;

public class Task56 {
	public static void main(String[] args) {
		int sum = 0;
		int largeSum = 0;
		for (BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("100")) < 0; a = a.add(BigInteger.ONE)) {
			for (int b = 2; b < 100; b++) {
				sum = 0;
				BigInteger num = a.pow(b);
				String string = num.toString();
				for (int x = 0; x < string.length(); x++) {
					sum += Integer.parseInt(string.substring(x, x + 1));
				}
				if (sum > largeSum) largeSum = sum;
			}
		}
		System.out.print(largeSum);
	}
}