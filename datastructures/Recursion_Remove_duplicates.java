package datastructures;
/* "abbccda" to "abcd" */
// 'a' - 'a'=0
// 'b'-'a'=1
// 'c'-'a'=2...'z'-'a'=25

public class Recursion_Remove_duplicates {


	public static boolean[] map = new boolean[26];

	public static void main(String[] args) {
		String str = "abbccda";
		removeDuplicates(str, 0, "");

	}

	public static void removeDuplicates(String str, int idx, String newstr) {

		if(idx==str.length())
		{
			System.out.println(newstr);
			return;
		}
		char currentChar = str.charAt(idx);
		if (map[currentChar - 'a']) {
			removeDuplicates(str, idx + 1, newstr);

		} else {
			newstr += currentChar;
			map[currentChar - 'a'] = true;
			removeDuplicates(str, idx + 1, newstr);
		}
	}
}
