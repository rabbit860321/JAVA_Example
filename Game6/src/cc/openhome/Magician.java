package cc.openhome;

public class Magician extends Role{
	public String toString() {
		return "�]�k�v" + super.toString();  //�ϥ�super�I�s�����O��k
	}
	public void fight() {
		System.out.println("�]�k����");
	}
	public void cure() {
		System.out.println("�]�k�v¡");
	}
}
