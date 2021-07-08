package cho_calander;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Prompt {
	Scanner scanner = new Scanner(System.in);
	Map<String,ArrayList<String>> map = new HashMap<>();
	
	
	
	
	public void print_help() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 일정 변경");
		System.out.println("| 4. 달력 보기");
		System.out.println("| 5. 오늘의 일정 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}
	
	
	
	public void runPrompt() {
	
		
		print_help();
		
		
		boolean flag = false;
		
		while(true) {
			System.out.println("명령 (1, 2, 3, 4, 5, h, q)");
			System.out.print("> ");
			String input = JOptionPane.showInputDialog("명령을 입력하세요");
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
					print_help(); break;
				case "q":
					System.out.println("Bye");
					flag = true;
					break;
				default:
					System.out.println("잘못된 입력입니다");
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
