package cho_calander;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Calendar;

public class Prompt {
	Scanner scanner = new Scanner(System.in);
	Map<String,ArrayList<String>> map = new HashMap<>();
	
	
	public void add_schedule() {
		
		System.out.println("[일정 등록] 날짜를 입력하세요.(ex 2021-02-13)");
		System.out.print("> ");
		String date = scanner.next();
		scanner.nextLine();
		System.out.println("일정을 입력하세요.");
		System.out.print("> ");
		
		String Schedule = scanner.nextLine();
		
		ArrayList<String> arr_schedule;
		
		if(map.containsKey(date)) {
			arr_schedule = map.get(date);
			arr_schedule.add(Schedule);
		}
		else {
			arr_schedule = new ArrayList<>();
			arr_schedule.add(Schedule);
		}
		
		map.put(date,arr_schedule);
		
		System.out.println("일정이 등록되었습니다.");
		
		
	}
	
	void see_schedule(){
		
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.print("> ");
		
		String date = scanner.next();
		ArrayList<String> arr_schedule = map.get(date);
		
		for(int i = 0; i < arr_schedule.size(); i++) {
			System.out.println(arr_schedule.get(i));
		}
		
		
	}
	
	void change_schedule() {
		System.out.println("[일정 변경] 날짜를 입력하세요.");
		System.out.print("> ");
		String date = scanner.next();
		
		System.out.println("[일정 변경] 변경할 일정의 인덱스를 입력하세요.");
		System.out.print("> ");
		int index = scanner.nextInt();
		
		System.out.println("[일정 변경] 변경할 일정을 입력하세요.");
		System.out.print("> ");
		String Schedule = scanner.next();
		
		ArrayList<String> arr_schedule;
		arr_schedule = map.get(date);
		arr_schedule.set(index, Schedule);
		
		map.put(date, arr_schedule);
		System.out.println("[일정 변경] 변경이 완료됐습니다.");
		
	}
	
	void today_schedule() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		String sample_year = Integer.toString(year);
		String sample_month = Integer.toString(month);
		if(month < 10) {
			sample_month = "0" + sample_month;
		}
		String sample_day = Integer.toString(day);
		if(day < 10) {
			sample_day = "0" + sample_day;
		}
		String sample_key =  sample_year + "-" + sample_month + "-" + sample_day;
		
		
		ArrayList<String> arr_schedule = map.get(sample_key);
		System.out.println("오늘의 일정입니다");
		for(int i = 0; i < arr_schedule.size(); i++) {
			System.out.println(arr_schedule.get(i));
		}
		
		
	}
	public void runPrompt() {
	
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 일정 변경");
		System.out.println("| 4. 달력 보기");
		System.out.println("| 5. 오늘의 일정 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		
		
		while(true) {
			System.out.println("명령 (1, 2, 3, 4, 5, h, q)");
			System.out.print("> ");
			String input = scanner.next();
			if(input.equals("1")) {
				add_schedule();
			}
			else if(input.equals("2")) {
				see_schedule();
			}
			else if(input.equals("3")) {
				change_schedule();
			}
			else if(input.equals("4")) {
				Calander.show_present_calender(map);
			}
			else if(input.equals("5")) {
				today_schedule();
			}
			else if(input.equals("h")) {
				System.out.println("도움말 입니다.");
			}
			else if(input.equals("q")) {
				System.out.println("Bye");
				break;
			}
			
		
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
