package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10000000; i++) { 
			if (squareChain(i) == 89) { 
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static int squareChain(int start) { 
		ArrayList<Integer> chain = new ArrayList<Integer>(Arrays.asList(start));
		int loop = 0;
		boolean carry = true;
		while (carry) { 
			String string = String.valueOf(chain.get(chain.size() - 1));
			int sum = 0;
			for (int i = 0; i < string.length(); i++) { 
				sum += Integer.parseInt(string.substring(i, i + 1)) * Integer.parseInt(string.substring(i, i + 1));
			}
			if (sum == 89 || sum == 1) { 
				loop = sum;
				carry = false;
			}
			else {
				chain.add(sum);
			}
		}
		return loop;
	}

}
