package projecteuler;

public class Task45 {

	public static void main(String[] args) {
		boolean carry = true;
		for (long i = 286L; carry; i++) {
			long triangle = nextTriangle(i);
			if (isPentagonal(triangle) && isHexagonal(triangle)) {
				System.out.println(triangle);
				carry = false;
			}
		}

	}

	public static long nextTriangle(long term) {
		long triangle = 0;
		triangle = (term * (term + 1)) / 2;
		return triangle;
	}

	public static boolean isPentagonal(long num) {
		boolean isPentagon = false;
		if (((Math.sqrt(24 * num + 1) + 1) / 6) % 1 == 0)isPentagon = true;
		return isPentagon;
	}

	public static boolean isHexagonal(long num) {
		boolean isHexagon = false;
		if (((Math.sqrt(8 * num + 1) + 1) / 4) % 1 == 0)isHexagon = true;
		return isHexagon;
	}

}
