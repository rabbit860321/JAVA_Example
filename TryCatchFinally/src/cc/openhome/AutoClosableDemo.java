package cc.openhome;

class Resource implements AutoCloseable{
//��@AutoCloseable���� �N�i�H�M�Φܹ��������귽�y�k
	@Override
	public void close() throws Exception {
		System.out.println("�귽�Q����");
		
	}
	void doSome() {
		System.out.println("���@�Ǩ�");
	}
}

public class AutoClosableDemo {

	public static void main(String[] args) {
		try(Resource res = new Resource()){
			res.doSome();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
