package cc.openhome;

import java.util.Arrays;

public class ArrayList2<E> {  //�����O�䴩�x��
	private Object[] elems;
	private int next;
	
	public ArrayList2(int capacity) {
		elems = new Object[capacity];
	}
	
	public ArrayList2() {
		this(16);
	}
	
	public void add(E e) {  //�[�J�����󥲶��O�Ȥ�ݫŧi��E���A
		if(next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length * 2);
		}
		elems[next++] = e;
	}
	
	public E get(int index) {  //���^����H�Ȥ�ݫŧi��E���A�Ǧ^
		return (E) elems[index];
	}
	
	public int size() {
		return next;
	}
}
