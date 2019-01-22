package cc.openhome;

public class Scores {

	public static void main(String[] args) {
		int[] scores = {30,50,40,90,80,70,60,60,70,30};
		for(int i = 0;i<scores.length;i++) {
			System.out.printf("學生分數:%d\n",scores[i]);
		}
		/*for(int score : scores) {      增強式for迴圈
			System.out.printf("學生分數:%d\n",score);
		}*/

	}

}
