package cc.openhome;

public class SwordsMan extends Role{
	public String toString() {
		return String.format("¼C¤h (%s,%d,%d)",this.getName(),this.getLevel(),this.getBlood());
	}
	public void fight() {
		System.out.println("´§¼C§ðÀ»");
	}
}
