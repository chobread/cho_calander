package cho_calander;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			
			if(month == -1) {
				System.out.println("Bye~");
				break;
			}
			
			Calander.show_calander(year,month);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
