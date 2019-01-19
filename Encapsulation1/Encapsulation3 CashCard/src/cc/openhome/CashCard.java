package cc.openhome;

class CashCard {
	private String number;    //�إ����O�p���ݩ�
	private int balance;
	private int bonus;
	
	CashCard(String number,int balance,int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	void store(int money) {        //�x�ȮɩI�s����k  (���|�Ǧ^��)
		if(money > 0) {
			this.balance += money;
			if(money >= 1000) {
				this.bonus++;
			}
		}else {
			System.out.println("�x�ȬO�t��?�A�O�Ӷê���?");
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
