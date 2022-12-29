package Java_Practice;
//SPy Number
/*
 * A positive integer is called a spy number if the sum and product of its digits are equal.
 * input =1124;
 * output: Spy Number //sum=1+1+2+4=8 product=1*1*2*4=8
 * input =456
 * output= Not Spy Number
 */
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = scanner.nextInt();
		int sum = 0;
		int product = 1;
		int num = input;
		scanner.close();

		while (input > 0) {
			int res = input % 10;
			sum = sum + res;
			product = res * product;
			input = input / 10;
		}
		if (sum == product) {
			System.out.println(num + " is Spy Number ");
		} else {
			System.out.println(num + " is Not Spy Number ");
		}
	}

}
