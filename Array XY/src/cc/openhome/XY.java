package cc.openhome;

public class XY {

	public static void main(String[] args) {
		int[][] cords = {
				{1,2,3},
				{4,5,6}
		};
		for(int x=0;x<cords.length;x++) { //���o�X�C
			for(int y=0;y<cords[x].length;y++) { //���o�C�C������
				System.out.printf("%2d", cords[x][y]);
			}
			System.out.println();
		}

	}

}
