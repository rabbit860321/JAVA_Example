package cc.openhome;

public class Submarine implements Swimmer{
	private String name;
	public Submarine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void swim() {
		System.out.printf("����� %s ���\n", name);
	}

}
