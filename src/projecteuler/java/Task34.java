package projecteuler;

public class Task34 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		int factorial = 1;
		for (int i = 3; i < 50000; i++) {
			String string = Integer.toString(i);
			num = 0;
			for (int x = 0; x < string.length(); x++) {
				int digit = Integer.parseInt(string.substring(x, x + 1));
				factorial = 1;
				for (int a = 1; a <= digit; a++) {
					factorial *= a;
				}
				num += factorial;
			}
			if (num == i) {
				sum += i;
			}
		}
		System.out.print(sum);
	}
}
