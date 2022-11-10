package datastructures;

// 1st and Lst occurarance of an element in string
// "abaacdaefaah"

public class Recursion_LastOccurance {

	public static int first = -1;
	public static int last = -1;

	public static void main(String arg[])

	{
		String str = "abaacdaefaah";
		findOccurance(str, 0, 'a');

	}

	public static void findOccurance(String str, int idx, char element) {

		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentChar = str.charAt(idx);
		if (currentChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		findOccurance(str, idx + 1, element);

	}
}
