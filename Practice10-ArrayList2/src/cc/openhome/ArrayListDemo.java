package cc.openhome;

import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		Scanner console = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.printf("����list1����:");
			list1.add(console.nextLine());
		}
		for(int i=0;i<3;i++) {
			System.out.printf("����list2����:");
			list2.add(console.nextLine());
		}
		
		System.out.println(list1.equals(list2));
		
        list2.add("C");
        System.out.println(list1.equals(list2));
	}

}
