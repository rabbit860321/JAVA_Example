package cc.openhome;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);  //�إ�console����
		int number = (int)(Math.random() * 10);
		int guess;
		
		do {
			System.out.printf("�q�Ʀr(0~9):");
			guess = console.nextInt();  //���o�U�@�Ӿ��
		}while(guess != number);
		
		System.out.println("�q���F~");
	}

}
