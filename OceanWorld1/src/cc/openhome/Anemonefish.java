package cc.openhome;

public class Anemonefish extends Fish{
	public Anemonefish(String name) {
		super(name);
	}
	public String getName() {
		return name;
	}
	public void swim() {
		System.out.printf("�p���� %s ��a\n", name);
	}

}
