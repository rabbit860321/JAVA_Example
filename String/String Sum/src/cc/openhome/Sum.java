package cc.openhome;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		long sum = 0;
		long number = 0;
		do {
			System.out.print("請輸入文字:");
			number = Long.parseLong(console.nextLine());
			sum += number;
		}while(number != 0);
		System.out.println("總和:" + sum);

	}

}
