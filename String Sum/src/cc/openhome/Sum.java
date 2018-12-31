package cc.openhome;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		long sum = 0;
		long number = 0;
		do {
			System.out.printf("輸入數字:");
			number = Long.parseLong(console.nextLine()); //將輸入的數值轉為long整數
			sum += number;
		}while(number!=0);  //輸入0會計算所有整數總數並顯示
		
		System.out.println("總和:"+sum); 

	}

}
