package projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Task57 {

	public static void main(String[] args) {
		int count = 0;
		ArrayList<BigInteger> num = new ArrayList<BigInteger>(Arrays.asList(BigInteger.ONE, new BigInteger("3")));
		ArrayList<BigInteger> den = new ArrayList<BigInteger>(Arrays.asList(BigInteger.ONE, new BigInteger("2")));
		for (int i = 1; i <= 1000; i++) { 
			num.add(num.get(i).multiply(new BigInteger("2")).add(num.get(i - 1)));
			den.add(den.get(i).multiply(new BigInteger("2")).add(den.get(i - 1)));
			if (String.valueOf(num.get(i + 1)).length() > String.valueOf(den.get(i + 1)).length()) { 
				count++;
			}
		}
		System.out.println(count);

	}

}
