package cc.openhome;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number;
		System.out.printf("�D�X�ӶO����?");
		number = console.nextInt();
		
		int[] arr = new int[number];  //�إߤ@�Ӫ��׬���J�Ȫ��}�C
		
		for(int i=0;i<arr.length;i++) {    //���X
			if(i<2) {
				arr[i] = i;
			}else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
