package cc.openhome;

import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collectNamtTo(names);
		System.out.println("�X�ȦW��: ");
		printUpperCase(names);
	}

	static void printUpperCase(ArrayList names) {
		for(int i =0;i<names.size();i++) {
			String name = (String) names.get(i);
			System.out.println(name);
		}
		
	}

	static void collectNamtTo(ArrayList names) {
		Scanner console = new Scanner(System.in);
		while(true) {
			System.out.printf("�X�ȦW��:");
			String name = console.nextLine();
			if(name.equals("quit")) {
				break;
			}
			names.add(name);
		}
		
	}

}
