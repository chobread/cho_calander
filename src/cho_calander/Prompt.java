package cho_calander;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String weekday) {
		if(weekday.equals("SU")) {
			return 0;
		}
		else if(weekday.equals("MO")) {
			return 6;
		}
		else if(weekday.equals("TU")) {
			return 5;
		}
		else if(weekday.equals("WE")) {
			return 4;
		}
		else if(weekday.equals("TH")) {
			return 3;
		}
		else if(weekday.equals("FR")) {
			return 2;
		}
		else if(weekday.equals("SA")) {
			return 1;
		}
		else 
			return 0;
	}
	public void runPrompt() {
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
			int int_weekday = parseDay(weekday);
			Calander.show_calander(year,month,int_weekday);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		
		
	
	}

}
