package datastructures;
//only one disk transferred in 1 step

/*
 smaller disks are always kept on top of the lager disks
 t(c) =O(2^n)
 */

public class Recursion_Tower_of_Hanoi {

	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n, "S", "H", "D");

	}

	public static void towerOfHanoi(int n, String src, String helper, String des) {

		if (n == 1) {
			System.out.println("transfer disk " + n + " from " + src + " to " + des);
			return;
		}
		towerOfHanoi(n - 1, src, des, helper);
		System.out.println("transfer disk " + n + " from " + src + " to " + des);
		towerOfHanoi(n - 1, helper, src, des);
	}

}
