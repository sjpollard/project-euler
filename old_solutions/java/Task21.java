package projecteuler;

public class Task21 {
	public static void main(String[] args) {
		int sum = 0;
		for (double num = 1; num < 10000; num++) {
			int sumfactors1 = 0;
			int sumfactors2 = 0;
			for (double factor = 1; factor <= (num / 2); factor++) {
				if ((num / factor) % 1 == 0) {
					sumfactors1 += factor;
				}
			}
			for (double factor = 1; factor <= (sumfactors1 / 2); factor++) {
				if ((sumfactors1 / factor) % 1 == 0) {
					sumfactors2 += factor;
				}
			}
			if(!(num == sumfactors1) && sumfactors2 == num) {
				sum += num;
			}
		}
		System.out.print(sum);
	}
}
