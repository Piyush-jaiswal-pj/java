package datastructures;

import java.util.LinkedList;

public class LinkedListWithBulitInFunction {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(4);
		System.out.println("Element in Linked List is " + list);
		list.remove(1);// indexing deletion

		System.out.println("Element in Linked List is " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
