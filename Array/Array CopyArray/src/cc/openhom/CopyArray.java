package cc.openhom;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] score1 = {20,45,67,35,10,89,46,30,70,98};
		int[] score2 = Arrays.copyOf(score1, score1.length);  //複製陣列
		for(int score:score1) {
			System.out.printf("%3d", score);
		}
		System.out.println();
		score2[0] = 99;
		//不影響score1參考的陣列物件
		for(int score:score1) {
			System.out.printf("%3d", score);
		}

	}

}
