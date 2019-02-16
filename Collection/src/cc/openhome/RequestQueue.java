package cc.openhome;

import java.util.*;

interface Request{
	void execute();
}

public class RequestQueue {

	public static void main(String[] args) {
		Queue requests = new LinkedList();
		offerRequestTo(requests);
		process(requests);
	}
	
	static void offerRequestTo(Queue requests) {
		//�����N�ШD�[�J��C
		for(int i = 1;i < 6;i++) {
			Request request = new Request() {
				public void execute() {
					System.out.printf("�B�z��� %f\n", Math.random());
				}
			};
			requests.offer(request);
		}
	}
	
	//�B�z��C�����ШD
	static void process(Queue requests) {
		while(requests.peek() != null) {
			Request request = (Request) requests.poll();
			request.execute();
		}
	}

}
