package cc.openhome;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		long sum = 0;
		long number = 0;
		do {
			System.out.printf("��J�Ʀr:");
			number = Long.parseLong(console.nextLine()); //�N��J���ƭ��ରlong���
			sum += number;
		}while(number!=0);  //��J0�|�p��Ҧ�����`�ƨ����
		
		System.out.println("�`�M:"+sum); 

	}

}
