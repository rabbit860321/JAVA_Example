package cc.openhome;

public abstract class Fish implements Swimmer{       //Fish類別擁有Swimmer行為(介面) implements
	protected String name;
	public Fish(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void swim();          
}
