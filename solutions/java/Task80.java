package projecteuler;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task80 {

	public static void main(String[] args) {
		int answer = 0;
		for (int i = 1; i <= 100; i++) { 
			if (!(Math.sqrt((double) i )% 1 == 0)) { 
				String root = sqrt(i).toString().substring(0, 101);
				String digits[] = root.split("\\.");
				root = digits[0] + digits[1];
				System.out.println(i + " " + root);
				int sum = 0;
				for (int x = 0; x < root.length(); x++) { 
					sum += root.charAt(x) - '0';
				}
				answer += sum;
			}
		}
		System.out.println(answer);

	}
	
	public static BigDecimal sqrt(int num) { 
		BigDecimal divisor = BigDecimal.valueOf(closestSquare(num));
		BigDecimal result = BigDecimal.ZERO;
		BigDecimal dividend = BigDecimal.valueOf(num);
		for (int i = 1; i <= 9; i++) { 
			result = dividend.divide(divisor, 101, RoundingMode.HALF_UP);
			divisor = result.add(divisor).divide(new BigDecimal("2"), 101, RoundingMode.HALF_UP);
		}
		return result;
	}
	
	public static int closestSquare (int num) { 
		int squares[] = {100, 81, 64, 49, 36, 25, 16, 9, 4, 1};
		int closest = 0;
		int smallDifference = 100;
		for (int square: squares) { 
			int difference = Math.abs(num - square);
			if (difference < smallDifference) { 
				smallDifference = difference;
				closest = square;
			}
		}
		return (int)Math.sqrt(closest);
	}

}
