package projecteuler;

public class Task7 {
	public static void main(String[] args) {
		int x = 0;
		int i = 1;
		int b = 0;
		while (x <= 10001) {
			b = 0;
			for (int a = 1; a <= i; a++) {
				if (i % a == 0) {
					b++;
				}
			}
			if (b == 2 || b == 1) {
				x++;
			}
			i++;
		}
		System.out.print(i - 1);
	}
}