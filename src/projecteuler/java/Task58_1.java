package projecteuler;

public class Task58_1 {

	public static void main(String[] args) {
		for (int length = 3; true; length += 2) { 
			
			int spiral[][] = new int[length][length];
			int count = 1;
			int x  = (length - 1) / 2;
			int y = (length - 1) / 2;
			spiral[y][x]  = 1;
			
			for (int i = 1; i <= length - 1;) { 
				
				for (int moves = 1; moves <= i; moves++) {
					count++;
					x += 1;
					spiral[y][x] = count;
				}
				
				for (int moves = 1; moves <= i; moves++) {
					count++;
					y -= 1;
					spiral[y][x] = count;
				}
				
				i++;
				
				for (int moves = 1; moves <= i; moves++) {
					count++;
					x -= 1;
					spiral[y][x] = count;
				}
				
				for (int moves = 1; moves <= i; moves++) {
					count++;
					y += 1;
					spiral[y][x] = count;
				}
				i++;
					
			}
			
			for (int i = 1; i <= length - 1; i++) { 
				count++;
				x += 1;
				spiral[y][x] = count;
			}
			
			int primes = 0;
			
			x = 0;
			y = 0;
			
			for (int i = 1; i <= length; i++) { 
				if (isPrime(spiral[y][x])) { 
					primes++;
				}
				x++;
				y++;
			}
			
			x = 0;
			y = length - 1;
			
			for (int i = 1; i <= length; i++) { 
				if (isPrime(spiral[y][x])) { 
					primes++;
				}
				x++;
				y--;
			}
			
			primes -= 2;
			
			double percentage = primes / ((length * 2.0) - 1);
			System.out.println(percentage);
			if (percentage < 0.1) { 
				System.out.println(length);
			}
			
		}

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
