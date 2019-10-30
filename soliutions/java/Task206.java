package projecteuler;

import java.math.BigInteger;

public class Task206 {

	public static void main(String[] args) {
		BigInteger num = BigInteger.ZERO;
		boolean carry = true;
		for (BigInteger i = new BigInteger("1058921220"); carry; i = i.add(BigInteger.ONE)) {
			num = i.pow(2);
			String string = String.valueOf(num);
			if (string.length() == 19) { 
				int count = 0;
				int runs = 0;
				for (int x = 0; x <= 18; x += 2) {
					if (Integer.parseInt(string.substring(x, x + 1)) == (x + 1 - runs) % 10) { 
						count++;
					}
					runs++;
				}
				if (count == 10) {
					System.out.println(i);
					carry = false;
				}
			}
		}
	}

}
