package cc.openhome;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class MathTool {               
	public static int sum(int... numbers) {    //不定長度引數
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}

public class ImportStatic {

	public static void main(String[] args) {
		Scanner console = new Scanner(in);
		out.print("請輸入名字:");
		out.printf("%s 你好!\n",console.nextLine());
		out.println(MathTool.sum(1,2));
		out.println(MathTool.sum(1,2,3));
		out.println(MathTool.sum(1,2,3,4));
	}

}
