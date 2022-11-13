package datastructures;

public class Recursion_Keypad_Combination {
	public static String[] keypad = { ",", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void main(String[] args) {
		String str = "23";
		printComb(str, 0, "");
	}

	public static void printComb(String str, int idx, String combination) {

		if (idx == str.length()) {
			System.out.println(combination);
			return;
		}
		char currentChar = str.charAt(idx);
		String mapping = keypad[currentChar - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			printComb(str, idx + 1, combination + mapping.charAt(i));

		}

	}
}
