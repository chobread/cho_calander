package cho_calander;
import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int num = scanner.nextInt();
		System.out.println("월을 입력하세요.");
		int[] input = new int[num];
		for(int i = 0; i < num; i++) {	
			int month = scanner.nextInt();
			input[i] = month;
		}
		for(int i = 0; i< num; i++) {
		System.out.printf("%d월은 %d일까지 있습니다.\n",input[i],arr[input[i]-1]);
		}
		scanner.close();
	}
}
