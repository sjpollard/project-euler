package projecteuler;

import java.math.BigInteger;

public class Task97 {

	public static void main(String[] args) {
		BigInteger prime = BigInteger.ZERO;
		prime = new BigInteger("28433").multiply(new BigInteger("2").pow(7830457)).add(BigInteger.ONE);
		String string = String.valueOf(prime);
		System.out.println(string.substring(2357197,2357207));
	}

}
