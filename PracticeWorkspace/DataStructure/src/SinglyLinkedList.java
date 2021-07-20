


public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void dispayList() {
		Node current = head;
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(10);
		list.addNode(90);
		list.addNode(40);
		list.addNode(23);
		list.addNode(50);
		list.addNode(56);
		list.addNode(89);
		
		list.dispayList();
	}
}
