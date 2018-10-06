package projecteuler;

public class Task50 {

	public static void main(String[] args) {
		int largest, answer, sum, count;
		count = sum = answer = largest = 0;
		for (int i = 2; i < 1000000; i++) { 
			if (isPrime(i)) {
				count = sum = 0;
				for (int x = i; sum < 1000000; x++) { 
					if(isPrime(x)) {
						sum += x;
						count++;
						if (isPrime(sum) && sum < 1000000 && count > largest) { 
							largest = count;
							answer = sum;
						}
					}
				}
			}
		}
		System.out.println(answer + " " + largest);

	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		int factors = 0;
		for (int x = 1; x * x <= num; x++) {
			if (num % x == 0) factors += 2;
			if (factors > 2) { 
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
	

}
