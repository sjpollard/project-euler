package projecteuler;

public class Task4 {
	public static void main(String[] args) {
		int palindrome,largepalindrome, num, output, length;
		palindrome = largepalindrome = num = output = length = 0;
		double product, remainder, newremainder;
		product = remainder = newremainder = 0;
		String string = "";
		for (int x = 100; x <= 999; x++ ) {
			for (int i = 100; i <= 999; i++) {
				product = (double) x * i;
				length = (int) Math.log10(product) + 1;
				for (int a = 1; a <= length; a++) {
					output = 0;
					remainder = product % Math.pow(10, a);
					newremainder = remainder / Math.pow(10, a - 1);
					num = (int) (newremainder);
					string = string + Integer.toString(num);
					output = Integer.valueOf(string);
					if (output - product == 0) {
						palindrome = (int)product;
					}
					if (palindrome > largepalindrome) {
						largepalindrome = palindrome;
					}
				}
				string = "";
			}
		}
		System.out.print(largepalindrome);
	}
}