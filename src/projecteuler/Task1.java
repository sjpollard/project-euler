package projecteuler;

public class Task1 {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		while (x < 1000) {
			if ((x / 3.0) % 1 == 0 || (x / 5.0) % 1 == 0) {
				y = y + x;
			}
			x = x + 1;
		}
		System.out.print(y);
	}
}