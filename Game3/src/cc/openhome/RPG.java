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
		
		showBlood(swordsman);  //Swordsman isa role
		showBlood(magician);   //Magician isa role
		//多型:在單一介面操縱多種形態的物件
		drawFight(swordsman);
		drawFight(magician);
	}
	
	static void showBlood(Role role) {    
		System.out.printf("%s 血量 %d\n", role.getName(),role.getBlood());
	}
	static void drawFight(Role role) {    
		System.out.printf(role.getName());
		role.fight();
	}

}
