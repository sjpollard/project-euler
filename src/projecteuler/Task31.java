package projecteuler;

public class Task31 {
	public static void main(String[] args) { 
		final long startTime = System.nanoTime();
		int coins[] = {1, 2, 5, 10, 20, 50, 100, 200};
		int table[][] = new int[201][8];
		for (int x = 0; x < 8; x++) table[0][x] = 1;
		for (int x = 0; x < 201; x++) table[x][0] = 1;
		for (int y = 0; y < 201; y++) { 
			for (int x = 1; x < 8; x++) { 
				if (coins[x] == y) { 
					table[y][x] = table[y][x - 1] + 1;
				}
				else if (coins[x] < y) { 
					table[y][x] = table[y][x - 1] + table[y - coins[x]][x];
				}
				else {
					table[y][x] = table[y][x - 1];
				}
			}
		}
		System.out.print(table[200][7]);
		final long endTime = System.nanoTime();
		System.out.println(" Total execution time: " + (endTime - startTime) );
	}
}
