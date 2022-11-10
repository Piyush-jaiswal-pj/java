package datastructures;


//SINGLY LINKED LIST
//Manual Implementation
class List {
	int data;
	Node next;
}

class LinkedList1 {
	private Node top;
	private int nodeCounter;

	public LinkedList1() {
		this.top = null;
		this.nodeCounter = 0;
	}

	public void add(int x) {
		Node temp = new Node();

		System.out.println("Adding an element " + x);
		temp.data = x;
		temp.next = top;
		top = temp;
		this.nodeCounter += 1;

	}

	public void display() {
		Node tempNode = top;
		System.out.print("Element in Linked list is :  ");
		while (tempNode != null) {
			System.out.print(tempNode.data);

			// assign temp link to temp
			tempNode = tempNode.next;
			if (tempNode != null)
				System.out.print(" -> ");
		}

	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.add(1);
		list.add(2);
		// System.out.println("Linked list elments are " + list);
		list.display();
	}

}
