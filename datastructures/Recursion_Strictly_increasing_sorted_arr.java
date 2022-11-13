package datastructures;

public class Recursion_Strictly_increasing_sorted_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5};

		System.out.println(isSorted(arr, 0));
		System.out.println(isSortedOptimise(arr, 0));

	}

	public static boolean isSorted(int arr[], int idx) {

		if (idx == arr.length - 1) {
			return true;
		}
		if (arr[idx] < arr[idx + 1]) {
			return isSorted(arr, idx + 1);
		} else {
			return false;
		}

	}
	
	//Optimizing the code with reverse terminology
	public static boolean isSortedOptimise(int arr[], int idx) {

		if (idx == arr.length - 1) {
			return true;
		}
		if (arr[idx] >= arr[idx + 1]) {
			return false;
		}
		return isSorted(arr, idx + 1);

	}
}
