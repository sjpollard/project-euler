package projecteuler;

import java.math.BigInteger;

public class Task55 {

	public static void main(String[] args) {
		int count = 0;
		for (BigInteger i = new BigInteger("1"); i.compareTo(new BigInteger("10000")) < 0; i = i.add(BigInteger.ONE)) { 
			if(isLychrel(i)) { 
				count++;
			}
		}
		System.out.println(count);

	}
	
	public static BigInteger reverse (BigInteger num) { 
		String reverseString = "";
		for (int i = 0; i < String.valueOf(num).length(); i++) { 
			reverseString += String.valueOf(num).charAt(String.valueOf(num).length() - 1 - i);
		}
		return new BigInteger(reverseString);
	}
	
	public static boolean isLychrel(BigInteger num) { 
		boolean isLychrel = true;
		int iterations = 0;
		BigInteger newNumber = num;
		while (iterations < 49) { 
			newNumber = newNumber.add(reverse(newNumber));
			if (!isPalindrome(String.valueOf(newNumber))) { 
				iterations++;
			}
			else { 
				isLychrel = false;
				break;
			}
		}
		return isLychrel;
	}
	
	public static boolean isPalindrome(String num) {
		boolean isPalindrome = false;
		String reverseString = "";
		for (int i = 0; i < num.length(); i++) { 
			reverseString += num.charAt(num.length() - 1 - i);
		}
		if (reverseString.equals(num)) { 
			isPalindrome = true;
		}
		return isPalindrome; 
	}
	
	

}
