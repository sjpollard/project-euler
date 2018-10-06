package projecteuler;

public class Task36 {
	public static void main(String[] args) { 
		long sum = 0;
		for (int num = 1; num < 1000000; num++) { 
			String numString = String.valueOf(num);
			String binary = Integer.toBinaryString(num);
			if (isPalindrome(numString) && isPalindrome(binary)) { 
				sum += num;
			}
		}
		System.out.print(sum);
	}
	public static boolean isPalindrome(String num) {
		boolean palindrome = false;
		int offset = 0;
		int length = num.length();
		num += " ";
		String front = num.substring(0, length / 2);
		if (length % 2 > 0) offset = 1;
		String end = num.substring((length / 2) + offset, length);
		int count = 0;
		for (int digit = 0; digit < front.length(); digit++) { 
			if (front.charAt(digit) == end.charAt(end.length() - 1 - digit)) { 
				count++;
			}
		}
		if (count == front.length()) palindrome = true;
		return palindrome; 
	}
}
