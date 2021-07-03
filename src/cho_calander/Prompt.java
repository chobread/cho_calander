package cho_calander;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Calendar;

public class Prompt {
	Scanner scanner = new Scanner(System.in);
	Map<String,ArrayList<String>> map = new HashMap<>();
	
	
	
	
	
	
	
	public void runPrompt() {
	
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 일정 변경");
		System.out.println("| 4. 달력 보기");
		System.out.println("| 5. 오늘의 일정 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		
		boolean flag = false;
		
		while(true) {
			System.out.println("명령 (1, 2, 3, 4, 5, h, q)");
			System.out.print("> ");
			String input = scanner.next();
			switch(input){
				case "1":
					Plan.add_schedule(map); break;
				case "2":
					Plan.see_schedule(map); break;
				case "3":
					Plan.change_schedule(map); break;
				case "4":
					Calander.show_present_calender(map); break;
				case "5":
					Plan.today_schedule(map); break;
				case "h":
					System.out.println("도움말 입니다."); break;
				case "q":
					System.out.println("Bye");
					flag = true;
					break; 		
			}
			if(flag) {
				break;
			}
		
		}
	}
	
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
