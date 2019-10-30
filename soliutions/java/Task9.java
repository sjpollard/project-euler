package projecteuler;

public class Task9 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int a = 1; a < 1000; a++) {
			for (int b = 2; b < 1000; b++) {
				for (int c = 3; c < 1000; c++) {
					if ((a*a) + (b*b) == c*c & a + b + c == 1000) {
						System.out.print(a * b * c);
					}
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nTook "+(endTime - startTime) + " ms");
	}
}
