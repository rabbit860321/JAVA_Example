package cc.openhome;

public class Game {

	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.UP);

	}
	public static void play(int action) {
		switch(action) {
		case Action.STOP:
			System.out.println("���񰱤�ʵe");
			break;
		case Action.RIGHT:
			System.out.println("����V�k�ʵe");
			break;
		case Action.LEFT:
			System.out.println("����V���ʵe");
			break;
		case Action.UP:
			System.out.println("����V�W�ʵe");
			break;
		case Action.DOWN:
			System.out.println("����V�U�ʵe");
			break;
		default:
			System.out.println("���䴩���ʧ@");
		}
	}

}
