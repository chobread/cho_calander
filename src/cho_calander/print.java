package cho_calander;
import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.",month,arr[month-1]);
		
		scanner.close();
	}
}
