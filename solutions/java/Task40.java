package projecteuler;

public class Task40 {

	public static void main(String[] args) {
		int product = 1;
		String champs = "";
		final long startTime = System.currentTimeMillis();
		for (int limit = 1; champs.length() < 1000000; limit++) { 
			champs = champs.concat(String.valueOf(limit));
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		for (int digit = 1; digit <= 1000000; digit *= 10) { 
			product *= Integer.parseInt(champs.substring(digit - 1, digit));
		}
		System.out.println(product);
	}

}
