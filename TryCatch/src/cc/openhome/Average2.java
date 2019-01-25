package cc.openhome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		try {
			Scanner console = new Scanner(System.in);
			double sum = 0;
			int count = 0;
			while(true) {
				int number = console.nextInt();
				if(number == 0) {
					break;
				}
				sum += number;
				count++;
			}
			System.out.printf("���� %.2f\n", sum / count);
		}catch(InputMismatchException ex) {
			System.out.println("������J���");
		}
		

	}

}
