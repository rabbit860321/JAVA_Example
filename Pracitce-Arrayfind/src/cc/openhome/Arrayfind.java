package cc.openhome;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfind {

	public static void main(String[] args) {
		int[] number = {1,10,31,33,37,48,60,70,80};
		Scanner console = new Scanner(System.in);
		
		System.out.printf("尋找指定數字:");
		int num = console.nextInt();
		
		System.out.printf("它在number[%d]",Arrays.binarySearch(number, num));

	}

}
