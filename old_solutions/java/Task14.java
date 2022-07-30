package projecteuler;

public class Task14 {
	public static void main(String[] args) {
		long z = 0, z1 = 0, b = 0 ;
		for (long i = 2; i < 1000000; i++) {
			z = 0;
			long a = i;
			while (a > 1) {
				if (a % 2 == 0) {
					a = a / 2;
				}
				else {
					a = (3 * a) + 1;
				}
				z = z + 1;
			}
			if (z > z1) {
				z1 = z;
				b = i;
			}
		}
		System.out.print(z1 + " " + b);
	}
}
