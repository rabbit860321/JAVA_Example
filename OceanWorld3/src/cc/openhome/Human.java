package cc.openhome;

public class Human implements Swimmer{  //Human��@Swimmer����
	private String name;
	public Human(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void swim() {
		System.out.printf("�H�� %s ��a\n", name);
	}
}
