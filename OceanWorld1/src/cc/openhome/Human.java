package cc.openhome;

public class Human implements Swimmer{  //Human實作Swimmer介面
	private String name;
	public Human(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void swim() {
		System.out.printf("人類 %s 游泳\n", name);
	}
}
