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
	public String toString() {
		StringBuilder all = new StringBuilder();
		for(int i=0;i<next;i++) {
			all.append((String)(elems[i]));
		}
		return all.toString();
	}
}
