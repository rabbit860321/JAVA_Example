package cc.openhome;

class Resource implements AutoCloseable{
//實作AutoCloseable介面 就可以套用至嘗試關閉資源語法
	@Override
	public void close() throws Exception {
		System.out.println("資源被關閉");
		
	}
	void doSome() {
		System.out.println("做一些事");
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
