package cc.openhome;

public class Shark extends Fish{
	public Shark(String name) {
		super(name);
	}
	public String getName() {
		return name;
	}
	public void swim() {
		System.out.printf("�T�� %s ��a\n", name);
	}

}
