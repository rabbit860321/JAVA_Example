package cc.openhome;

public class FlyingFish extends Fish implements Flyer{    //FlyingFish�~��Fish���O��@Flyer����
	public FlyingFish(String name) {
		super(name);
	}
	public void swim() {
		System.out.println("������a");
	}
	public void fly() {
		System.out.println("�����|��");
	}
}
