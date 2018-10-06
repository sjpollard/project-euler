package projecteuler;

public class Task28 {
	public static void main(String[] args) { 
		int skip, total, count;
		count = 0; skip = total = 1;
		for (int i  = 3; i <= 1001 * 1001; i += skip + 1) { 
			total += i;
			count++;
			if (count % 4 == 0) skip += 2;
		}
		System.out.print(total);
	}
}
