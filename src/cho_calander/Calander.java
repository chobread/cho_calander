package cho_calander;

import java.util.Scanner;

public class Calander {
	public static void show_calander(int year, int month, String weekday){
		System.out.printf("     <<%4d %d>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxday = getMaxMonth(month);
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
				maxday += 1;
			}
		}
		int intweekday=-1;
	if(weekday.equals("SU")) {
		intweekday = 0;
	}
	else if(weekday.equals("MO")) {
		intweekday = 6;
	}
	else if(weekday.equals("TU")) {
		intweekday = 5;
	}
	else if(weekday.equals("WE")) {
		intweekday = 4;
	}
	else if(weekday.equals("TH")) {
		intweekday = 3;
	}
	else if(weekday.equals("FR")) {
		intweekday = 2;
	}
	else if(weekday.equals("SA")) {
		intweekday = 1;
	}
	if(intweekday != 0) {
	for(int i=0; i< 7-intweekday; i++) {
	System.out.printf("   ");
	}
	}
		for(int i=1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == intweekday) {
				System.out.println();
			}
			
		}
		System.out.println();
	}
	
	public static int getMaxMonth(int month) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return arr[month-1];
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			String weekday = scanner.next();
			
			if(month == -1) {
				System.out.println("Bye~");
				break;
			}
			show_calander(year,month,weekday);
		}
		
		scanner.close();
	}
}
