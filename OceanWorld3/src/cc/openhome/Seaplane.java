package cc.openhome;

public class Seaplane implements Swimmer,Flyer{    //Seaplane���O��@Swimmer Flyer����
	private String name;
	public Seaplane(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.printf("���W���� %s �b��\n", name);
	}
	public void swim() {
		System.out.printf("���W���� %s ������\n", name);
	}
}
