package cho_calander;

public class Calander {
	public static void show_calander(int year, int month, int weekday){
		System.out.printf("     <<%4d %d>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxday = getMaxMonth(month);
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
				maxday += 1;
			}
		}
	
	if(weekday != 0) {
	for(int i=0; i< 7-weekday; i++) {
	System.out.printf("   ");
	}
	}
		for(int i=1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == weekday) {
				System.out.println();
			}
			
		}
		System.out.println();
	}
	
	public static int getMaxMonth(int month) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return arr[month-1];
	}
	
}
