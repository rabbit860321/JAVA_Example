package cc.openhome;

public class Armstrong {

	public static void main(String[] args) {
		int a,b,c;
		
        for(int i = 100;i<=999;i++){
            a = i/100;           //���ʦ��
            b = (i % 100) / 10;  //���Q���
            c = i%10;            //���Ӧ��
            if((a*a*a)+(b*b*b)+(c*c*c) == i){
                System.out.println(i);
            }
        }
	}

}
