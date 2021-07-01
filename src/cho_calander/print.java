package cho_calander;
import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print("> ");
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,arr[month-1]);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}
}
