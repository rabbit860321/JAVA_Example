package cc.openhome;

public abstract class Role {  //類別中有抽象方法須在class前加上abstract:抽象類別
	protected String name;
	protected int level;
	protected int blood;
	
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
	public abstract void fight();  //抽象方法
}
