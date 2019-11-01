package projecteuler;

public class Task37 {
	public static void main(String[] args) {
		int factors = 0;
		int truefact = 0;
		int num = 0;
		for (int i = 11; i < 1000000; i++) {
			String string = String.valueOf(i);
			truefact = 0;
			for (int x = 0; x < string.length(); x++) {
				factors = 0;
				String newString = string.substring(x);
				int numString = Integer.parseInt(newString);
				for (int a = 1; a * a <= numString; a++) {
					if (numString % a == 0 && !(numString == 1)) {
						factors += 2;
					}
				}
				if (factors == 2) { 
					truefact++;
				}
			}
			for (int x = string.length(); x > 0; x--) {
				factors = 0;
				String newString = string.substring(0, x);
				int numString = Integer.parseInt(newString);
				for (int a = 1; a * a <= numString; a++) {
					if (numString % a == 0 && !(numString == 1)) {
						factors += 2;
					}
				}
				if (factors == 2) { 
					truefact++;
				}
			}
			if (truefact == string.length() * 2) {
				num += i;
			}
		}
		System.out.print(num + " ");
	}
}