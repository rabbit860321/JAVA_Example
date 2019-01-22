package cc.openhome;

public class SwordsMan extends Role{
	public String toString() {
		return "劍士" + super.toString();  //使用super呼叫父類別方法
	}
	public void fight() {
		System.out.println("揮劍攻擊");
	}
}
