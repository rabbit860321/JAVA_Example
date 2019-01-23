package cc.openhome;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("����"));
		doSwim(new Shark("����"));
		doSwim(new Human("�봵��"));
		doSwim(new Submarine("����@��"));
	}
	
	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}

}
