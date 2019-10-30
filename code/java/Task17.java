package projecteuler;

public class Task17 {
	public static void main(String[] args) {
		final String HUNDRED = "hundred";
		final String THOUSAND = "thousand";
		int letters = 0;
		int i;
		String[] units = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		for (i = 1; i <= 1000; i++) {
			for (double x = 1; x <= String.valueOf(i).length(); x++) {
				if (x == 1) {
					if (!(i % 10 == 0) && !((i % 100) / 10 == 1)) {
					letters += units[(int) (i % Math.pow(10, x)) - 1].length();
					}
				}
				if (x == 2) {
					if (!(i % 100 == 0)) {
						if (i % 10 == 0 || (i % 100) / 10 > 1) {
							letters += tens[(int) ((i % 100) / Math.pow(10, x - 1)) - 1].length();
						}
						else if ((i % 100) / 10 == 1) {
							letters += teens[(int) (i % Math.pow(10, x - 1)) - 1].length();
						}
					}
				}
				if (x == 3) {
					if (!(i % 1000 == 0)) {
						letters += units[(int) (i / Math.pow(10, x - 1)) - 1].length() + HUNDRED.length();
						if (!(i % 10 == 0) || !(i % 100 == 0) ) {
						letters += 3;
						}
					}
					
				}
				if (x == 4) {
					letters += units[(int) (i / Math.pow(10, x - 1)) - 1].length() + THOUSAND.length();
					
				}
			}
		}
		System.out.print(letters);
	}
}
