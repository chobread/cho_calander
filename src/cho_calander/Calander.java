package cho_calander;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class Calander {
	public static void show_calander(int year, int month){
		System.out.printf("     <<%4d %d>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxday = getMaxMonth(month);
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
				maxday += 1;
			}
		}
		int weekday = calculate_day(year, month);
		
		if(weekday != 0) {
			for(int i=0; i< weekday; i++) {
			System.out.printf("   ");
			}
		}
		for(int i=1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 7-weekday) {
				System.out.println();
			}
			
		}
		System.out.println();
	}
	

	public static void show_present_calender(Map<String,ArrayList<String>> map) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		
		String sample_year = Integer.toString(year);
		String sample_month = Integer.toString(month);
		if(month < 10) {
			sample_month = "0" + sample_month;
		}
			
		
		System.out.printf("     <<%4d %d>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxday = getMaxMonth(month);
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
				maxday += 1;
			}
		}
		int weekday = calculate_day(year, month);
		
		if(weekday != 0) {
			for(int i=0; i< weekday; i++) {
			System.out.printf("   ");
			}
		}
		for(int i = 1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 7-weekday) {
				System.out.println();
				if(i == 7-weekday) {
					for(int k = 0; k < weekday; k++) {
					System.out.printf("   ");
					}
					for(int m = 1; m <= i; m++) {
						String sample_day = "0"+Integer.toString(m);
						String sample_key =  sample_year + "-" + sample_month + "-" + sample_day;
						if(map.containsKey(sample_key)) {
							System.out.printf("  .");
						}
						else {
							System.out.printf("   ");
						}
					}
				}
				else {
				for(int j = i-6; j <= i; j++) {
					String sample_day = Integer.toString(j);
					if(j<10) {
						sample_day = "0" + sample_day;
					}
					String sample_key =  sample_year + "-" + sample_month + "-" + sample_day;
					if(map.containsKey(sample_key)) {
						System.out.printf("  .");
					}
					else {
						System.out.printf("   ");
					}
				}
				}
				System.out.println();
			}
		
		}
		System.out.println();
		
	}
	
	public static int getMaxMonth(int month) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return arr[month-1];
	}
	
	public static int calculate_day(int year, int month) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
			arr[1] = 29;
		}
		
		year--;
		
		int totaldays = (365*year) + (year/4) - (year/100) + (year / 400);
		
		for(int i=0; i<month-1; i++) {
			totaldays += arr[i];
		}
		totaldays++;
		return (totaldays%7);
	}
}
