package cc.openhom;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] score1 = {20,45,67,35,10,89,46,30,70,98};
		int[] score2 = Arrays.copyOf(score1, score1.length);  //�ƻs�}�C
		for(int score:score1) {
			System.out.printf("%3d", score);
		}
		System.out.println();
		score2[0] = 99;
		//���v�Tscore1�ѦҪ��}�C����
		for(int score:score1) {
			System.out.printf("%3d", score);
		}

	}

}
