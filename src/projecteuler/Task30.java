package projecteuler;

public class Task30 {
	public static void main(String[] args) {
		double num = 0;
		int sum = 0;
		for (int i = 2; i < 1000000; i++) {
			String string = Integer.toString(i * 10);
			num = 0;
			for(int x = 0; x <= string.length()-1; x++) {
				double digit = Integer.parseInt((string.substring(x, x + 1)));
				num += Math.pow(digit, 5);
			}
			if (num == i) { 
				System.out.print(num + " ");
				sum += num;
			}
		}
		System.out.print(sum);
	}
}
