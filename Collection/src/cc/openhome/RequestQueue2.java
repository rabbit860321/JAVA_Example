package cc.openhome;

import java.util.*;

interface Request2{
	void execute();
}

public class RequestQueue2 {

	public static void main(String[] args) {
		Queue<Request2> request = new LinkedList<>();
		offerRequestTo(request);
		process(request);
	}
	
	static void offerRequestTo(Queue<Request2> request) {
		for(int i = 1;i<6;i++) {
			request.offer(
					() -> System.out.printf("處理資料 %f\n", Math.random())
					);
		}
	}
	
	static void process(Queue<Request2> requests) {
		while(requests.peek() != null) {
			Request2 request = requests.poll();
			request.execute();
		}
	}
}
