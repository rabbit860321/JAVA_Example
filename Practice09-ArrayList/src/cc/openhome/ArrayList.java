package cc.openhome;

import java.util.Arrays;

public class ArrayList {
	private Object[] elems;  //�ϥ�Object�}�C����
	private int next;        //�U�@�ӥi�x�s���󪺯���
	
	public ArrayList(int capacity) {  //���w����e�q
		elems = new Object[capacity];
	}
	public ArrayList() {
		this(16);          //��l�e�q�w�]16
	}
	public void add(Object o) {
		if(next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length*2); //�W���}�C����
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
