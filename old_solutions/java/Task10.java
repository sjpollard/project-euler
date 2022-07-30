package projecteuler;

public class Task10 {
	public static void main(String[] args) {
		long x = 0;
		int i = 3;
		int b = 0;
		while (i < 2000000) {
			b = 0;
			for (int a = 1; a <= Math.sqrt(i); a++) {
				if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 9 == 0) {
					break;
				}
				if (i % a == 0) {
					b++;
				}
			}
			if (b == 1) {
				x += i;
			}
			i = i + 2;
		}
		System.out.print(x + 2 + 3 + 5 + 7);
	}
}