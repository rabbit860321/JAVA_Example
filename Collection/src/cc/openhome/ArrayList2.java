package cc.openhome;

import java.util.Arrays;

public class ArrayList2<E> {  //此類別支援泛型
	private Object[] elems;
	private int next;
	
	public ArrayList2(int capacity) {
		elems = new Object[capacity];
	}
	
	public ArrayList2() {
		this(16);
	}
	
	public void add(E e) {  //加入的物件必須是客戶端宣告的E型態
		if(next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length * 2);
		}
		elems[next++] = e;
	}
	
	public E get(int index) {  //取回物件以客戶端宣告的E型態傳回
		return (E) elems[index];
	}
	
	public int size() {
		return next;
	}
}
