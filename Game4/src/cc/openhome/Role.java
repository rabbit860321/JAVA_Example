package cc.openhome;

public abstract class Role {  //���O������H��k���bclass�e�[�Wabstract:��H���O
	private String name;
	private int level;
	private int blood;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public abstract void fight();  //��H��k
}
