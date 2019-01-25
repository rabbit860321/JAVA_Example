package cc.openhome;

public class MulitChat {

	public static void main(String[] args) {
		Client c1 = new Client("127.0.0.1","Eric");
		Client c2 = new Client("192.168.0.2","Justin");
		
		ClientQueue queue = new ClientQueue();
		queue.addClientListener(new ClientListener() {             //�ΦW�������O:��@���O�u�ϥΤ@�� ���ݬ��o�����O�w�q�W�ٮ�
			public void clientAdded(ClientEvent event) {
				System.out.printf("%s �q %s �s�u\n", event.getName(),event.getIp());
			}
			public void clientRemoved(ClientEvent event) {
				System.out.printf("%s �q %s ���u\n", event.getName(),event.getIp());
			}
		});
		
		queue.add(c1);
		queue.add(c2);
		queue.remove(c1);
		queue.remove(c2);
	}

}
