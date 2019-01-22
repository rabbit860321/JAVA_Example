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
		//�h��:�b��@�������a�h�اκA������
	}
	
	static void showBlood(Role role) {    
		System.out.printf("%s ��q %d\n", role.getName(),role.getBlood());
	}

}
