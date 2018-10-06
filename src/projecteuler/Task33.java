package projecteuler;

public class Task33 {

	public static void main(String[] args) {
		for (int num = 10; num < 100; num++) {
			for (int den = 10; den < 100; den++) {
				if (num % den > 0) {
					commonDigit(num, den);
				}
			}
		}
	}

	public static double commonDigit(int num, int den) {
		int commonDigit = 0;
		String numString = String.valueOf(num);
		String denString = String.valueOf(den);
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				if (numString.charAt(a) == denString.charAt(b)) {
					int newNum = Integer.parseInt(numString.substring(1 - a, 1 - a + 1));
					int newDen = Integer.parseInt(denString.substring(1 - b, 1 - b + 1));
					double decimal = newNum / (double) newDen;
					if (decimal == num / (double) den) { 
						System.out.println(num + " " + den);
					}
				}
			}
		}
		return commonDigit;
	}

}
