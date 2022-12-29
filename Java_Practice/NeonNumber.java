package Java_Practice;
// check if the given number is neon or not
import java.util.Scanner;
/*
 * A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
 * 
 * input = 9
 * output= neon number//9^2=81 : 8+1=9
 */
public class NeonNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = scanner.nextInt();
		int sum=0;
		scanner.close();
		int sqr = input*input;
		while(sqr>0) {
			int res = sqr %10;
			sum=sum+res;
			sqr=sqr/10;
		}
		if(sum == input) {
			System.out.println(input + " is Neon Number");
		}
		else {
			System.out.println(input + " is Not Neon Number");
		}

	}

}
