package cc.openhome;

public class Magician extends Role{
	public String toString() {
		return "魔法師" + super.toString();  //使用super呼叫父類別方法
	}
	public void fight() {
		System.out.println("魔法攻擊");
	}
	public void cure() {
		System.out.println("魔法治癒");
	}
}
