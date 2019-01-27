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
	
	void store(int money){        //�x��
		checkGreaterThanZero(money,"�п�J����");
		this.balance += money;
		if(money >= 1000) {
			this.bonus++;
		}
		/*if(money > 0) {
			this.balance += money;
			if(money >= 1000) {
				this.bonus++;
			}
		}else {
			System.out.println("�x�ȬO�t��?�A�O�Ӷê���?");
		}*/
	}
	public void charge(int money) throws InsufficientException{
		checkGreaterThanZero(money,"�п�J����");
		checkBalance(money);
		this.balance -= money;
	}
	
	private void checkGreaterThanZero(int money, String msg) {  //�P�_�O�_���t�� �p�t�� �ߥXIllegalArgumentException
		if(money < 0) {
			throw new IllegalArgumentException(msg);
		}
	}
	private void checkBalance(int money) throws InsufficientException {  //�P�_�l�B�O�_���� 
        if(money > this.balance) {
            throw new InsufficientException("�l�B����", this.balance);
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
