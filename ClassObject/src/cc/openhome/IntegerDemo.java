package cc.openhome;

public class IntegerDemo {

	public static void main(String[] args) {
		int data1 = 10;
		int data2 = 20;
		
		Integer wrapper1 = new Integer(data1);
		Integer wrapper2 = new Integer(data2);
		
		//Integer data1 = 10;  //�۰ʸ˽c
		//Integer data2 = 20;
		
		System.out.println(data1 / 3);  //�򥻫��A�B��
		System.out.println(wrapper1.doubleValue() / 3);  //�ާ@�]�q����k
		System.out.println(wrapper1.compareTo(wrapper2));  //�ۦP0 �p��-1

	}

}
