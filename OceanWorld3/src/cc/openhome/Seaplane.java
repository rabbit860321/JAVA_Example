package cc.openhome;

public class Seaplane implements Swimmer,Flyer{    //Seaplane類別實作Swimmer Flyer介面
	private String name;
	public Seaplane(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.printf("海上飛機 %s 在飛\n", name);
	}
	public void swim() {
		System.out.printf("海上飛機 %s 航行海面\n", name);
	}
}
