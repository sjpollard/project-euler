package projecteuler;

public class Task44 {

	public static void main(String[] args) {
		 for (int a = 1; a < 10000; a++) { 
			 for (int b = 1; b < 10000; b++) { 
				 int penta = pentGenerator(a);
				 int pentb = pentGenerator(b);
				 if (isPent(penta + pentb) && isPent(Math.abs(pentb - penta))) { 
					 System.out.println(penta + " " + pentb + " " + Math.abs(pentb - penta));
				 }
			 }
		 }
	
	}
	
	public static int pentGenerator(int n) { 
		int currentPent = 0;
		currentPent = n * (3 * n - 1) / 2;
		return currentPent;
	}
	
	public static boolean isPent(int n) { 
		boolean isPent = false;
		if (((Math.sqrt(24 * n + 1) + 1) / 6) % 1 == 0) { 
			isPent = true;
		}
		return isPent;
	}

}