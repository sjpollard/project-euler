package projecteuler;

public class Task5 {
	public static void main(String[] args) {
		int x = 0;
		int a = 0;
		for (x = 1; a < 20;) {
			x++;
			a = 0;
			for (int i = 20; i > 0; i--) {
				if (x % i == 0) {
					a += 1;
				}
				if (a < 20 - i) break;
			}
		}
		System.out.print(x);
	}
}
