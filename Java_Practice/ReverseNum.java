package Java_Practice;

//Reverse a Number
//Input : 1234
//Output : 4321
import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter the number to be reverse");
		int input = sc.nextInt();
		while (input !=0) //its runs till input is not equal to 0
		{
			int res = input % 10; //it stores reminder
			System.out.print(res); //print this reminder
			input = input / 10; //dividing the input with 10 
		}
	}

}
