package projecteuler;

public class Task12{
	public static void main(String[] args){
		long total = 0;
		int divisors = 0;
		double sqrt = 0;
		for(int i = 1; divisors < 500; i++){
			divisors = 0;
			total += i;
			sqrt = Math.sqrt(total);
			for (double x = 1; x <= sqrt; x++){
				if ((total / x) % 1 == 0) {
					divisors += 2;
				}
			}
		}
		System.out.print(total);
	}
}