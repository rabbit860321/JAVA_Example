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
		System.out.printf("����%.2f\n", sum / count);
	}
	
	static Scanner console = new Scanner(System.in);
	
	static int nextInt() {
		String input = console.nextLine();
		while(!input.matches("\\d*")) {
			//�W�h��ܦ� �Yinput�D�Ʀr�榡 ���榹�j��
			System.out.println("�п�J�Ʀr");
			input = console.nextLine();
		}
		return Integer.parseInt(input);
	}

}
