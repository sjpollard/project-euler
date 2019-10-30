package projecteuler;

public class Task3 {
	public static void main(String[] args) {
		long x = 600851475143L;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) { 
				x = x / i;
				System.out.print(i + " ");
			}
		}
	}
}
