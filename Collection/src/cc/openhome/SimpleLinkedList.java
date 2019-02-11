package cc.openhome;

public class SimpleLinkedList {
	private class Node{           //�N�����������Node�ʸ� 
		Object o;
		
		Node(Object o){
			this.o = o;
		}
		
		Node next;
	}
	
	private Node first;  //�Ĥ@�Ӹ`�I
	
	public void add(Object elem) {    //�s�WNode�ʸ˪��� �åѤW�@��Node��next�Ѧ�
		Node node = new Node(elem);
		
		if(first == null) {
			first = node;
		}else {
			append(node);
		}
	}
	
	public void append(Node node) {
		Node last = first;
		while(last.next != null) {
			last = last.next;
		}
		last.next = node;
	}
	
	public int size() {          //���X�Ҧ�Node�íp��w���o����
		int count = 0;
		Node last = first;
		while(last != null) {
			last = last.next;
			count++;
		}
		return count;
	}
	
	public Object get(int index) {
		checkSize(index);
		return findElemOf(index);
	}
	
	private void checkSize(int index) throws IndexOutOfBoundsException{
		int size = size();
		if(index >= size) {                         //�Y��J�����޼ƶW�L���� �ߥX
			throw new IndexOutOfBoundsException(
				String.format("Index: %d, Size: %d", index,size));
			
		}
	}
	
	private Object findElemOf(int index) {
		int count = 0;
		Node last = first;
		while(count < index) {
			last = last.next;
			count++;
		}
		return last.o;
	}
	
}
