package cc.openhome;

public class Magician extends Role{
	public String toString() {
		return String.format("�]�k�v (%s,%d,%d)",this.getName(),this.getLevel(),this.getBlood());
	}
	public void fight() {
		System.out.println("�]�k����");
	}
	public void cure() {
		System.out.println("�]�k�v¡");
	}
}
