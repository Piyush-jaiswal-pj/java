package datastructures;

/* 
 'abc' subse a
 sub seq = har have choice to come and join or not by foloowing the ordered
 abc ab bc ac a b c
 
 
 
 */
public class Recursion_subsequences {

	public static void main(String[] args) {
	String str="abc";
	subSequences(str, 0, "");
	}

	public static void subSequences(String str, int idx, String newstr) {
		if (idx == str.length()) {
			System.out.println(newstr);
			return;
		}
		char currentChar = str.charAt(idx);
		subSequences(str, idx + 1, newstr + currentChar);

		subSequences(str, idx + 1, newstr);
		
	}

}
