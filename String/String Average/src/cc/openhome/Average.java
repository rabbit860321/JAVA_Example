package cc.openhome;

public class Average {

	public static void main(String[] args) {
		long sum = 0;
		for(String arg : args) {
			sum += Long.parseLong(arg);  //�R�O�C�޼�
		}
		System.out.println("����:" + (float)sum / args.length);
	}

}
