package cc.openhome;

import java.util.*;

public class Stack {
	
	private Deque elems = new ArrayDeque();
	private int capacity;
	
	public Stack(int capacity) {
		this.capacity = capacity;
	}
	public boolean push(Object elem) {
		if(isFull()) {
			return false;
		}
		return elems.offerLast(elem);
	}
	private boolean isFull() {
		return elems.size() +1 > capacity;
	}
	public Object pop() {
		return elems.pollLast();
	}
	public Object peek() {
		return elems.peekLast();
	}
	public int size() {
		return elems.size();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push("Justin");
		stack.push("Monica");
		stack.push("Irene");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//堆疊結構是先進後出
	}

}
