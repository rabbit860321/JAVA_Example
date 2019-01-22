package cc.openhome;

public class IntegerDemo {

	public static void main(String[] args) {
		int data1 = 10;
		int data2 = 20;
		
		Integer wrapper1 = new Integer(data1);
		Integer wrapper2 = new Integer(data2);
		
		//Integer data1 = 10;  //自動裝箱
		//Integer data2 = 20;
		
		System.out.println(data1 / 3);  //基本型態運算
		System.out.println(wrapper1.doubleValue() / 3);  //操作包裹器方法
		System.out.println(wrapper1.compareTo(wrapper2));  //相同0 小於-1

	}

}
