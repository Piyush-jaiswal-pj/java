package datastructures;

//initializing node 
class Node {
	int data;
	Node next; // linkNode is a reference variable
}

class StackImplementation {
	private int nodeCount;
	private Node top;

	StackImplementation() {
		this.top = null;
		this.nodeCount = 0;
	}

	public void push(int x) {

		Node tempNode = new Node();

		System.out.println("Inserting a element " + x);

		tempNode.data = x;

		tempNode.next = top;

		top = tempNode;

		this.nodeCount += 1;
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}

		int top = peek();
		System.out.println("Element removing " + top);
		this.nodeCount = -1;

		this.top = (this.top).next;
		return top;

	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return top.data;

	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return this.nodeCount;

	}

	public void display() {
		if (top == null) {
			System.out.println("Stack is overflow");
			System.exit(1);
		}
		Node tempNode = top;
		System.out.print("Element in stack is :  ");
		while (tempNode != null) {
			System.out.print(tempNode.data);

			// assign temp link to temp
			tempNode = tempNode.next;
			if (tempNode != null)
				System.out.print(" -> ");
		}

	}
}

public class StackWithLinkedList {

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(3);
		stack.push(2);
		System.out.println("The top element is " + stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();

		stack.display();

	}

}
