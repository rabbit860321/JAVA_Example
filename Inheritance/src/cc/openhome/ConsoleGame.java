package cc.openhome;

import java.util.Scanner;

public class ConsoleGame extends GuessGame{
	private Scanner console = new Scanner(System.in);
	
	public void print(String text) {
		System.out.printf(text);
	}
	public int nextInt() {
		return console.nextInt();
	}
}
