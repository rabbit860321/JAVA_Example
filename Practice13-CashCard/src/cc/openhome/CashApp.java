package cc.openhome;

import java.util.Scanner;

public class CashApp {

	public static void main(String[] args) throws InsufficientException {
		CashCard[] cards = {
				new CashCard("A001",500,0),
				new CashCard("A002",300,0),
				new CashCard("A003",1000,1)
		};
		
		Scanner console = new Scanner(System.in);
		for(CashCard card : cards) {
			System.out.printf("��(%s, %d, %d) �x��:",card.getNumber(),card.getBalance(),card.getBonus());
			card.store(console.nextInt());
			System.out.printf("����(%s, %d, %d)\n",card.getNumber(),card.getBalance(),card.getBonus());
			System.out.printf("��(%s, %d, %d) ����:",card.getNumber(),card.getBalance(),card.getBonus());
			card.charge(console.nextInt());
			System.out.printf("����(%s, %d, %d)\n",card.getNumber(),card.getBalance(),card.getBonus());
		}

	}

}
