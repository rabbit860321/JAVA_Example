package cc.openhome;

public class Shuffle02 {

	public static void main(String[] args) {
		String[] num = {"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","11","12","13",
				"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","11","12","13",
				"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","11","12","13",
				"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","11","12","13"};
		
		String[] shu = new String[52];  //©ñ¶Ã¼Æ
		
		char[] color = {'®ç','¿j','±ö','¤ß'};
		
		int n;
		for(int i=0;i<shu.length;i++) {
			n = (int)(Math.random()*(52-i));  
			shu[i] = num[n];
			for(int j = n;j<shu.length - 1;j++) {
				num[j] = num[j+1];
			}
		}
		
		
		for(int i=0;i<shu.length;i++) {
			switch(i%4) {
			case 0:
				System.out.print(color[0] + " " + shu[i] + "  ");
				break;
			case 1:
				System.out.print(color[1] + " " + shu[i] + "  ");
				break;
			case 2:
				System.out.print(color[2] + " " + shu[i] + "  ");
				break;
			case 3:
				System.out.print(color[3] + " " + shu[i] + "  ");
				break;
			}
			
			if(i == 12 || i == 25 || i ==38 || i == 51) {
				System.out.print("\n");
			}
		}
		

	}

}
