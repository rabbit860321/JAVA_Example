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
	
	void store(int money){        //儲值
		//checkGreaterThanZero(money,"請輸入正數");
		assert money >= 0 : "請輸入正數";  
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
			System.out.println("儲值是負的?你是來亂的嗎?");
		}*/
	}
	public void charge(int money) throws InsufficientException{
		//checkGreaterThanZero(money,"請輸入正數");
		assert money >= 0 : "請輸入正數";
		checkBalance(money);
		this.balance -= money;
	}
	
	/*private void checkGreaterThanZero(int money, String msg) {  //判斷是否為負數 如負數 拋出IllegalArgumentException
		if(money < 0) {
			throw new IllegalArgumentException(msg);
		}
	}*/
	private void checkBalance(int money) throws InsufficientException {  //判斷餘額是否足夠 
        if(money > this.balance) {
            throw new InsufficientException("餘額不足", this.balance);
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
