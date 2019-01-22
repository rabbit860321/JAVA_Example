package cc.openhome;

public class RPG {

	public static void main(String[] args) {
		SwordsMan swordsman = new SwordsMan();
		swordsman.setName("Eric");
		swordsman.setLevel(1);
		swordsman.setBlood(200);
		
		Magician magician = new Magician();
		magician.setName("Julia");
		magician.setLevel(1);
		magician.setBlood(100);
		
		System.out.println(swordsman.toString());
		System.out.println(magician.toString());
		drawFight(swordsman);
		drawFight(magician);
	}
	
	static void showBlood(Role role) {    
		System.out.printf("%s ¦å¶q %d\n", role.getName(),role.getBlood());
	}
	static void drawFight(Role role) {    
		System.out.printf(role.getName());
		role.fight();
	}

}
