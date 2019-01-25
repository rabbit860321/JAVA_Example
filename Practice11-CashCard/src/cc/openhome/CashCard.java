package cc.openhome;

class CashCard {
	private String number;    //建立類別私有屬性
	private int balance;
	private int bonus;
	
	CashCard(String number,int balance,int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	public String getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public int getBonus() {
		return bonus;
	}
}
