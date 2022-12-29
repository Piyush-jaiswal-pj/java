package Java_Practice;

import java.util.Scanner;

//find tech numbers through a Java program.
/*
 tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle. 
 After equally dividing the number, sum up the numbers and find the square of the sum.
 
 */
public class TechNumber {

	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in);
		System.out.println("enter tech number");
		int input = scanner.nextInt();
		
		scanner.close();
		int num =input;  
		//determines the last digit of the given number  
		int p1 = input % 100;  
		//removes the last digit of the number  
		int p2 = input / 100;  
		//add the two parts i.e. p1 and p2  
		int sum = p1 + p2;  
		//square the sum that we get from the above statement and compare the square with the given number  
		if (num == (sum * sum))  
		//prints the tech number  
		System.out.println(num + " is tech number");  
		
		else {
			System.out.println(num+" not tech number");
		}
		}  
	}

