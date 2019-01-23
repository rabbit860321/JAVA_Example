package cc.openhome;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("����"));
		doSwim(new Shark("����"));
		doSwim(new Human("�봵��"));
		doSwim(new Submarine("����@��"));
		doSwim(new Seaplane("�ŭx�s��"));
		doSwim(new FlyingFish("�ƥ�"));
	}
	
	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}

}
