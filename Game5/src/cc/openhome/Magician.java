package cc.openhome;

public class Magician extends Role{
	public String toString() {
		return String.format("�]�k�v (%s,%d,%d)",this.name,this.level,this.blood);
	}
	public void fight() {
		System.out.println("�]�k����");
	}
	public void cure() {
		System.out.println("�]�k�v¡");
	}
}
