package projecteuler;

public class Task2 {
	public static void main(String[] args) {
		int x, y, z, num = 2;
		x = 1;
		y = 2;
		while (y < 4000000) {
			z = x + y;
			if (z % 2 == 0) {
				num = num + z;
			}
			x = y;
			y = z;
		}
		System.out.print(num);
	}
}
