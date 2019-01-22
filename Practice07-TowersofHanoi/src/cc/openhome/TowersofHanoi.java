package cc.openhome;

import java.util.Scanner;

public class TowersofHanoi {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.printf("請輸入盤數:");
		move(console.nextInt(),'A','B','C');
	}
	static void move(int n,char a,char b,char c) {
		if(n == 1) {
			System.out.printf("盤由 %c 移至 %c\n", a,c);
		}else {
			move(n-1,a,c,b);
			move(1,a,b,c);
			move(n-1,b,a,c);
		}
	}

}
