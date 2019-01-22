package cc.openhome;

public class SwordsMan extends Role{
	public String toString() {
		return String.format("¼C¤h (%s,%d,%d)",this.name,this.level,this.blood);
	}
	public void fight() {
		System.out.println("´§¼C§ðÀ»");
	}
}
