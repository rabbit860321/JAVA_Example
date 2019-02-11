package cc.openhome;

import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("�п�J�^��:");
		Set words = tokenSet(console.nextLine());
		System.out.printf("�����Ƴ�r�� %d ��:%s\n", words.size(),words);

	}
	static Set tokenSet(String line) {
		String[] tokens = line.split(" "); //�ھڪťդ��Φr��
		return new HashSet(Arrays.asList(tokens));  //�ϥ�HashSet��@�����r��
	}

}
