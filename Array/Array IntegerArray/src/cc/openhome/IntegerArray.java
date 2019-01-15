package cc.openhome;

public class IntegerArray {

	public static void main(String[] args) {
		Integer[] scores = new Integer[3];
		for(Integer score : scores) {
			System.out.println(score);   //null
		}
		scores[0] = new Integer(99);    //scores[0] = 99 �۰ʸ˽c
		scores[1] = new Integer(66);
		scores[2] = new Integer(65);
		for(Integer score : scores) {
			System.out.println(score);
		}

	}

}
