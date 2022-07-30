package projecteuler;

public class Task6 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		for (int i = 1; i <= 100; i++) {
			x = (int) (x + Math.pow(i, 2));
			y = (int) (y + i);
		}
		y = (int) Math.pow(y, 2);
		System.out.print(y - x);
	}
}
