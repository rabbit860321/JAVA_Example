package cc.openhome;

public class Game {

	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.DOWN);

	}
	public static void play(Action action) {
		switch(action) {
		case STOP:
			System.out.println("���񰱤�ʵe");
			break;
		case RIGHT:
			System.out.println("����V�k�ʵe");
			break;
		case LEFT:
			System.out.println("����V���ʵe");
			break;
		case UP:
			System.out.println("����V�W�ʵe");
			break;
		case DOWN:
			System.out.println("����V�U�ʵe");
			break;
		}
	}

}
