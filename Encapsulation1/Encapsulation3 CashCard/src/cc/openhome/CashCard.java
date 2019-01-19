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
	
	void store(int money) {        //儲值時呼叫的方法  (不會傳回值)
		if(money > 0) {
			this.balance += money;
			if(money >= 1000) {
				this.bonus++;
			}
		}else {
			System.out.println("儲值是負的?你是來亂的嗎?");
		}
	}

	String getNumber() {
		return number;
	}

	int getBalance() {
		return balance;
	}

	int getBonus() {
		return bonus;
	}
}
