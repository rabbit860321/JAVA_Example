package cc.openhome;

import java.util.*;

class Student{
	
	private String name;
	private String number;
	
	Student(String name,String number){
		this.name = name;
		this.number = number;
	}
	
	public String toString() {
		return String.format("(%s, %s)", name,number);
	}
}

public class Students {
	public static void main(String[] args) {
		Set students = new HashSet();
		students.add(new Student("Justin","B835031"));
		students.add(new Student("Monica","B835032"));
		students.add(new Student("Justin","B835031"));
		System.out.println(students);
		/*沒有告訴Set 什麼樣的Students實例才算是重複*/
	}
}
