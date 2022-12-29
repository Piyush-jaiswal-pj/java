package Java_Practice;

import java.util.Scanner;

//check whether a given number is Peterson or not 
//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
/*
 input =  Number = 145

145 = !1 + !4 + !5

=1+4*3*2*1+5*4*3*2*1

=1+24+120

145=145 is peterson 
 */
public class PetersonNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int input = scanner.nextInt();
		scanner.close();
		int fact = 1;
		int sum = 0;
		int temp = input;
		int res;
		while (input >0) {
			 res = input % 10;
			 System.out.println("rev num " + res);
			 input = input / 10;
			for (int i = 1; i <=res; i++) {
				fact = fact * i;
			}
			System.out.println("fac " + fact);
			sum = sum + fact;
			fact=1; // to take value of new num val
			System.out.println("sum " + sum);
			

		}
		if (temp == sum) {
			System.out.println(temp + " is PeterNumber");
		} 
		else {
			System.out.println(temp + " is Not PeterNumber");

		}

	}
}
