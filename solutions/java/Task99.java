package projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Task99 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\Sam Pollard\\Downloads\\p099_base_exp.txt"));
		int largecount = 0;
		int count = 0;
		double largest = 0;
		while (sc.hasNextLine()) { 
			count++;
			String line = sc.nextLine();
			int index = 0;
			String numbers[] = line.split(",");
			double base = Integer.parseInt(numbers[0]);
			int power = Integer.parseInt(numbers[1]);
			double result = 0;
			result = power * Math.log(base);
			if (result > largest) {
				largest = result;
				largecount = count;
			}
		}
		System.out.println(largecount);
	}

}
