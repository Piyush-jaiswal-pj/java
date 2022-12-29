package Java_Practice;
//Automorphic Number or not
import java.util.Scanner;
//A number is called an automorphic number if and only if the square of the given number ends with the same number itself.
//input =76;
//output =Automorphic Number //76*76 =5776 where last two digit of 5776 is 76= inpput
public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = scanner.nextInt();
		
		int sqr= input*input;
	//	System.out.println("sqr is: "+sqr);
		int num = input;
		scanner.close();
		int count=0;
		int temp=num;;
		
		while(input>0) {
			input=input/10;
			count++;
			//System.out.println("count is: " + count);
		}
		int res=0;
		int res1=0;
		while(count>0) {
			res=sqr%10;
			res1=num%10; 
			/*System.out.println(res);
			System.out.println(res1);*/
			if(res!=res1) {
			//	System.out.println("Not Neon");
				break;
			}
			sqr=sqr/10;
			num=num/10;
			count--;
		}
		if(res!=res1) {
			System.out.println(temp+" Given number is Not Automorphic Number");
		}else {
			System.out.println(temp+" Given number is Automorphic Number");
		}
		

	}

}
