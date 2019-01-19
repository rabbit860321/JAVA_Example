package cc.openhome;

class CashCard {
	String number;
	int balance;
	int bonus;
	
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
	
	void charge(int money) {        //���ڮɩI�s����k
		if(money > 0) {
			if(money <= this.balance) {
				this.balance -= money;
			}else {
				System.out.println("��������!");
			}
		}else {
			System.out.println("���t��?�o���O�s���x�ȶ�?");
		}
	}
	
	int exchange(int bonus) {      //�I�����Q�I�ƩI�s����k
		if(bonus > 0) {
			this.bonus -= bonus;
		}
		return this.bonus;
	}
}
