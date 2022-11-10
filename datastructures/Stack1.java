package datastructures;

public class Stack1 {

	private int totalmemory;
	private int arr[];
	private int top;

	public Stack1(int size) {

		arr = new int[size];
		totalmemory = size;
		top = -1;
	}

	public int push(int data) {
		if (isFull()) {

			System.out.println("Stack is Overflow");
			System.exit(1);
		}

		System.out.println("Push is performed successfully :" + data);
		return arr[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1); // terminates the program
		}

		System.out.println("Pop is performed successfully : " + arr[top] + " is poped");
		return arr[top--];

	}

	void display() {
		
		System.out.print("Data in Stack is : ");
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public boolean isFull() {

		return top == totalmemory - 1; // checks stack is empty or not
	}

	public boolean isEmpty() {

		return top == -1; // checks stack is empty or not
	}

	public int stackSize() {
		return top + 1;
	}

	public static void main(String[] args) {

		Stack1 stack = new Stack1(3);

		stack.push(3);
		stack.push(5);
		stack.push(5);

		stack.display();
	
		System.out.println("\nSize of Stack is : " + stack.stackSize());
		
		stack.pop();
		stack.pop();
		stack.display();
	}

}
