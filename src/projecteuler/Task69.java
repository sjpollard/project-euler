package projecteuler;

public class Task69 {

	public static void main(String[] args) {
		double ntotient = 0;
		double largeNtotient = 0;
		int ans = 0;
		int x = 1;
		for (int i = 2; true;) { 
			if (isPrime(x += 2)) { 
				i *= (x);
			}
			ntotient = (double)i / eulersTotient(i);
			if (ntotient > largeNtotient) { 
				System.out.println(i + " " + ntotient);
				largeNtotient = ntotient;
				ans = i;
			}
		}

	}
	
	public static int eulersTotient(int n) { 
		int totient = 0;
		for (int i = 1; i < n; i++) { 
			if (gcd(n, i) == 1) { 
				totient++;
			}
		}
		return totient;
	}
	
	public static int gcd(int a, int b) { 
		int dividend = a;
		int divisor = b;
		int remainder = 0;
		while (!(divisor == 0)) { 
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
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
