package cc.openhome;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number;
		System.out.printf("求幾個費式數?");
		number = console.nextInt();
		
		int[] arr = new int[number];  //建立一個長度為輸入值的陣列
		
		for(int i=0;i<arr.length;i++) {    //走訪
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
