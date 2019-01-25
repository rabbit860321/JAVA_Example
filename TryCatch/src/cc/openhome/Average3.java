package cc.openhome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		while(true) {
			try {
				int number = console.nextInt();
				if(number == 0) {
					break;
				}
				sum += number;
				count++;
			}catch(InputMismatchException ex) {
				System.out.printf("���L�D��ƿ�J:%s\n",console.next());  //�Y��J�D��Ƹ���catch�϶� ���٦b�j�餺
			}
		}
		System.out.printf("���� %.2f\n", sum / count);
	}

}
