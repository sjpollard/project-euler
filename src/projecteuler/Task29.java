package projecteuler;

import java.math.BigInteger;
import java.util.HashSet;

public class Task29 {
	public static void main(String[] args) {
		HashSet<BigInteger> set = new HashSet<BigInteger>();
		for (BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("100")) <= 0; a = a.add(BigInteger.ONE)) {
			for (int b = 2; b <= 100; b++) {
				set.add(a.pow(b));
			}
		}
		System.out.print(set.size());
	}
}
