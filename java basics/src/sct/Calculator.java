package sct;
import java.util.Scanner;

//using switch case

public class Calculator {

	public static void main(String[] args) {
		Scanner i= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = i.nextInt();
		System.out.println("Enter the value of a:");
		int b = i.nextInt();
		System.out.println("Enter your choice :");
		System.out.println("Enter 1 for the addition:");
		System.out.println("Enter 2 for the subtraction:");
		System.out.println("Enter 3 for the multiple:");
		System.out.println("Enter 4 for the divide:");
		int choice=i.nextInt();
		
		switch(choice)
		{
		case 1:
			int c=a+b;
			System.out.println("The addition is :"+ c);
			break;
		case 2:
			int d=a-b;
			System.out.println("The subtraction is :"+ d);
			break;
		case 3:
			int e=a*b;
			System.out.println("The multiplication is :"+ e);
			break;
		case 4:
		float  f=a/b;
			System.out.println("The division is :"+ f);
			break;
			default :
				System.out.println("Invalid");
				break;
				
			
		}

	}

}
