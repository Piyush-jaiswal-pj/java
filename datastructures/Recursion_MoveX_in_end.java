package datastructures;
//Move all "x" to the end of the string


///input "axbcxxd" to output "abcdxxx"
public class Recursion_MoveX_in_end {

	public static void main(String arg[])
	{
		String str="axbcxxd";
		moveXInEnd(str, 0, 0,"");
	}
	
	public static void moveXInEnd(String str,int idx,int count,String newStr)
	
	{
		if(idx==str.length())
		{
			for(int i=0;i<count;i++)
			{
				newStr +='x';
			}
			System.out.println(newStr);
			return;
		}
		char currentChar= str.charAt(idx);
		if(currentChar=='x')
		{
			count++;
			moveXInEnd(str, idx+1, count, newStr);
		}
		else {
			newStr +=currentChar;//add cur char in new string
			moveXInEnd(str, idx+1, count, newStr);
		}
		
	}
}
