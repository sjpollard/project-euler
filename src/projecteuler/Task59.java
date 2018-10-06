package projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task59 {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("C:\\Users\\Sam Pollard\\eclipse-workspace\\ProjectEuler\\src\\projecteuler\\cipher.txt"));
			int array[] = new int[1201];
			int index = 0;
			while (sc.hasNext()) { 
				array[index] = Integer.parseInt(sc.next());
				index++;
			}
			/*for (int a = 97; a < 123; a++) { 
				for (int b = 97; b < 123; b++) {
					for (int c = 97; c < 123; c++) {
						int newArray[] = XOR(array, ((char)a+""+(char)b+""+(char)c));
						String text = "";
						for (int num: newArray) { 
							text += (char)num;
						}
						for (int i = 0; i < text.length() - 3; i++) { 
							if (text.substring(i, i + 3).equals("The")) { 
								System.out.println(text + " " + (char)a+""+(char)b+""+(char)c);
							}
						}
					}
				}
				
			}*/
			int sum = 0;
			for (int num: XOR(array, "god")) { 
				sum += (char)num;
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static int[] XOR(int array[], String code) { 
		int newArray[] = new int[1201];
		for (int digit = 0; digit < 3; digit++) { 
			for (int i = digit; i < 1201; i += 3) { 
				newArray[i] = array[i] ^ code.charAt(digit);
			}
		}
		return newArray;
	}

}
