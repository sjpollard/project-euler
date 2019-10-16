package projecteuler;

public class Task39 {
	public static void main(String[] args) { 
		int mostSolutions = 0;
		int solutions = 0;
		int perimeterAnswer = 0;
 		for (int perimeter = 120; perimeter <= 1000; perimeter++) { 
			solutions = 0;
			for (int a = 1; a < perimeter; a++) { 
				for (int b = 1; b < perimeter; b++) { 
					double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
					if (c % 1 == 0 && a + b + c == perimeter) { 
						solutions++;
					}
				}
			}
			solutions /= 2;
			if (solutions > mostSolutions) { 
				perimeterAnswer = perimeter;
				mostSolutions = solutions;
			}
		}
		System.out.print(perimeterAnswer);
	}
}
