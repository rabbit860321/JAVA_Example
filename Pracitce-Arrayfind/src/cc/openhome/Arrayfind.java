package cc.openhome;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfind {

	public static void main(String[] args) {
		int[] number = {1,10,31,33,37,48,60,70,80};
		Scanner console = new Scanner(System.in);
		
		System.out.printf("�M����w�Ʀr:");
		int num = console.nextInt();
		
		System.out.printf("���bnumber[%d]",Arrays.binarySearch(number, num));

	}

}
