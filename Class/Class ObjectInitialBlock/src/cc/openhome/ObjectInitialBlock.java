package cc.openhome;

class Other{
	{
		System.out.println("�����l�϶�");
	}
	
	Other(){
		System.out.println("Other() �غc��");
	}
	
	Other(int o){
		this();   //�I�s�t�@�ӫغc��
		System.out.println("Other(int o) �غc��");
	}
}

public class ObjectInitialBlock {

	public static void main(String[] args) {
		Other n = new Other(1);
	}

}
