package cc.openhome;

import java.util.Arrays;

public class ArrayList {
	private Object[] elems;  //使用Object陣列收集
	private int next;        //下一個可儲存物件的索引
	
	public ArrayList(int capacity) {  //指定物件容量
		elems = new Object[capacity];
	}
	public ArrayList() {
		this(16);          //初始容量預設16
	}
	public void add(Object o) {
		if(next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length*2); //增長陣列長度
		}
		elems[next++] = o;
	}
	public Object get(int index) {
		return elems[index];
	}
	public int size() {
		return next;
	}
	public Object equals(ArrayList list2) {
		if(this.size() == list2.size()) {
			return true;
		}else {
			return false;
		}
	}
}
