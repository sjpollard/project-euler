package projecteuler;

import java.util.ArrayList;

public class Task26 {
	public static void main(String[] args) {
		int bigcount = 0;
		int carry = 0;
		int count = 0;
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num = 3; num <= 997; num++) {
			if (isPrime(num) == true && !(num == 5)) {
				list.clear();
				carry = 0;
				int digit = 1;
				for (int i = 1; carry < 3; i++) {
					int divide = digit / num;
					int remainder = digit % num;
					if (digit == 0) {
						digit *= 10;
					} else {
						digit = 10 * remainder;
					}
					if (i > 1) {
						list.add(divide);
					}
					if (i % 2 == 0) {
						count = 0;
						for (int pos = 0; pos < list.size() / 2; pos++) {
							if (list.get(pos) == list.get(pos + list.size() / 2)) {
								count++;
							}
							if (count == list.size() / 2) {
								carry++;
								list.clear();
								if (count > bigcount) {
									answer = num;
									bigcount = count;
								}
							}
						}
					}
				}
			}
		}
		System.out.print(" " + answer + " " + bigcount);
	}

	public static boolean isPrime(int num) {
		boolean isPrime = false;
		int factors = 0;
		for (int x = 1; x * x <= num; x++) {
			if (num % x == 0)
				factors += 2;
		}
		if (factors == 2) {
			isPrime = true;
		}
		return isPrime;
	}
}