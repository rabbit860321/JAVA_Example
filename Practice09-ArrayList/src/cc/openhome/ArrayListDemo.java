package cc.openhome;

import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Scanner console = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.printf("收集物件:");
			list.add(console.nextLine());
		}
		
		System.out.println(list);
		

	}

}
