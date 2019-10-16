package projecteuler;

public class Task19 {
	public static void main(String[] args) {
		int firstMonthMondays = 1;
		int days = 0;
		int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daysInMonthLeap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1901; i <= 2000; i++) {
			if (i % 400 == 0) { 
				for (int a = 0; a < daysInMonth.length; a++) {days += daysInMonthLeap[a];if (days % 7 == 0) firstMonthMondays += 1;};
			}
			else if(i % 4 == 0 && !(i % 100 == 0)) { 
				for (int a = 0; a < daysInMonth.length; a++) {days += daysInMonthLeap[a];if (days % 7 == 0) firstMonthMondays += 1;};
			}
			else {
				for (int a = 0; a < daysInMonth.length; a++) {days += daysInMonth[a];if (days % 7 == 0) firstMonthMondays += 1;};
			}
			
		}
		System.out.print(firstMonthMondays);
	}
}
