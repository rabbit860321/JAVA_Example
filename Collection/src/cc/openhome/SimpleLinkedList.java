package cc.openhome;

public class SimpleLinkedList {
	private class Node{           //將收集的物件用Node封裝 
		Object o;
		
		Node(Object o){
			this.o = o;
		}
		
		Node next;
	}
	
	private Node first;  //第一個節點
	
	public void add(Object elem) {    //新增Node封裝物件 並由上一個Node的next參考
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
	
	public int size() {          //走訪所有Node並計算已取得長度
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
		if(index >= size) {                         //若輸入的索引數超過索引 拋出
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
