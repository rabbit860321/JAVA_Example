package cc.openhome;

class Some{
	
	void someMethod(int i) {
		System.out.println("int �����Q�I�s");
	}
	
	void someMethod(Integer integer) {
		System.out.println("Integer �����Q�I�s");
	}
}

public class OverloadBoxing {

	public static void main(String[] args) {
		Some s = new Some();
		s.someMethod(1);
		s.someMethod(new Integer(1));
	}

}
