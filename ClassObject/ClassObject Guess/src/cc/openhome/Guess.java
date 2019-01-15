package cc.openhome;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);  //建立console物件
		int number = (int)(Math.random() * 10);
		int guess;
		
		do {
			System.out.printf("猜數字(0~9):");
			guess = console.nextInt();  //取得下一個整數
		}while(guess != number);
		
		System.out.println("猜中了~");
	}

}
