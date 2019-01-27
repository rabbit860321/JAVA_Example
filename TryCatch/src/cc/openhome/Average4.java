package cc.openhome;

import java.util.Scanner;

public class Average4 {

	public static void main(String[] args) {
		double sum = 0;
		int count = 0;
		while(true) {
			int number = nextInt();
			if(number == 0) {
				break;
			}
			sum += number;
			count++;
		}
		System.out.printf("平均%.2f\n", sum / count);
	}
	
	static Scanner console = new Scanner(System.in);
	
	static int nextInt() {
		String input = console.nextLine();
		while(!input.matches("\\d*")) {
			//規則表示式 若input非數字格式 執行此迴圈
			System.out.println("請輸入數字");
			input = console.nextLine();
		}
		return Integer.parseInt(input);
	}

}
