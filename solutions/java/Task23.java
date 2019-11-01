package projecteuler;

import java.util.ArrayList;
import java.util.HashSet;

public class Task23 {
	public static void main(String[] args) {
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		HashSet<Integer> abundantSums = new HashSet<Integer>();
		long sum = 0L;
		long numSum2 = 0L;
		long numSum = 0L;
		long sumFactors = 0L;
		for (long i = 2L; i < 28123; i++) {
			sumFactors = 0;
			for (long x = 1L; x < i; x++) {
				if (i % x == 0) {
					sumFactors += x;
				}
			}
			if (sumFactors > i) {
				abundantNums.add((int)i);
			}
		}
		for (Integer num : abundantNums) {
			for (Integer num2 : abundantNums) {
				sum = num + num2;
				if (sum <= 28123) {
					abundantSums.add((int)sum);
				}
			}
		}
		numSum = (28123 * 28124) / 2;
		for (Integer num: abundantSums) { 
			if (num <= 28123) {
				numSum2 += num;
			}
		}
		System.out.print(numSum - numSum2);
	}
}
