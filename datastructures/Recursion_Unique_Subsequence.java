package datastructures;

import java.util.HashSet;

/*
 *  set = unique sets 
 *  so  we  r using hashset which keeps unique set
 */
public class Recursion_Unique_Subsequence {

	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		subSequences(str, 0, "", set);
	}

	public static void subSequences(String str, int idx, String newstr, HashSet<String> set) {
		if (idx == str.length()) {
			if (set.contains(newstr)) {
				return;
			} else {
				System.out.println(newstr);
				set.add(newstr);
				return;
			}
		}
		char currentChar = str.charAt(idx);
		subSequences(str, idx + 1, newstr + currentChar,set);

		subSequences(str, idx + 1, newstr,set);

	}

}
