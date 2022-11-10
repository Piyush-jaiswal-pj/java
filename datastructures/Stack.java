package datastructures;

public class Stack {

	private int top;
	private int capacity;
	private int arr[];

	 Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public int push(int x) {
		if (isFull()) {
			System.out.println("Stack is Overflow");
			System.exit(1);
		}
		return arr[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		
		 System.out.println("Data is poped" );
		 return arr[top--];

	}

	public int getSize() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(1);
		stack.push(3);
		stack.display();
		stack.pop();
		stack.display();

	}
}
