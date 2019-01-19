package cc.openhome;

import java.util.Scanner;

public class CashApp {

	public static void main(String[] args) {
		CashCard[] cards = {
				new CashCard("A001",500,0),
				new CashCard("A002",300,0),
				new CashCard("A003",1000,1)
		};
		
		Scanner console = new Scanner(System.in);
		for(CashCard card : cards) {
			System.out.printf("¬°(%s, %d, %d) Àx­È:",card.number,card.balance,card.bonus);
			card.store(console.nextInt());
			System.out.printf("©ú²Ó(%s, %d, %d)\n",card.number,card.balance,card.bonus);
		}

	}

}
