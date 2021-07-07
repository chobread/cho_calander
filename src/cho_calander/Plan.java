package cho_calander;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;



public class Plan {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void add_schedule(Map<String,ArrayList<String>> map) {
		
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
		
		File f = new File("calander.dat");
		String item = date + "," + Schedule;
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(item);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	 static void see_schedule(Map<String,ArrayList<String>> map){
		
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.print("> ");
		
		String date = scanner.next();
		ArrayList<String> arr_schedule = map.get(date);
		
		for(int i = 0; i < arr_schedule.size(); i++) {
			System.out.println(arr_schedule.get(i));
		}
		
		
	}
	 static void change_schedule(Map<String,ArrayList<String>> map) {
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
	
	public static void today_schedule(Map<String,ArrayList<String>> map) {
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
	
	
}
