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
				System.out.printf("略過非整數輸入:%s\n",console.next());  //若輸入非整數跳到catch區塊 但還在迴圈內
			}
		}
		System.out.printf("平均 %.2f\n", sum / count);
	}

}
