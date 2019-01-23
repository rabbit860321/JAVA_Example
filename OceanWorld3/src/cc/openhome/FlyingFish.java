package cc.openhome;

public class FlyingFish extends Fish implements Flyer{    //FlyingFish繼承Fish類別實作Flyer介面
	public FlyingFish(String name) {
		super(name);
	}
	public void swim() {
		System.out.println("飛魚游泳");
	}
	public void fly() {
		System.out.println("飛魚會飛");
	}
}
