package cc.openhome;

public class Magician extends Role{
	public String toString() {
		return String.format("魔法師 (%s,%d,%d)",this.getName(),this.getLevel(),this.getBlood());
	}
	public void fight() {
		System.out.println("魔法攻擊");
	}
	public void cure() {
		System.out.println("魔法治癒");
	}
}
