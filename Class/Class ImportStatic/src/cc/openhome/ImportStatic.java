package cc.openhome;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class MathTool {               
	public static int sum(int... numbers) {    //���w���פ޼�
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
		out.print("�п�J�W�r:");
		out.printf("%s �A�n!\n",console.nextLine());
		out.println(MathTool.sum(1,2));
		out.println(MathTool.sum(1,2,3));
		out.println(MathTool.sum(1,2,3,4));
	}

}
