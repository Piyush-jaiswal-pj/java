
//JAVA SUBSTRING

//Sample Input
//Helloworld
//3 7

//Sample Output
//lowo



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.String.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=start;i<end;i++)
        {
            char index=S.charAt(i);
            System.out.print(index);
        }
    }
}