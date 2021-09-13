package sct;
import java.util.Scanner;//scanner package (cin)
public class While_example {
	//aim :  program to calculate the sum of first 10 natural number

	public static void main(String[] args) {
	Scanner i = new Scanner(System.in);
	System.out.println("Enter the natural number");
	int number=i.nextInt();
	int sum=0;
	if(number==0)
	{
		System.out.println("The entered number is 0 which is not nautral number");

	}
	else {
	while(number<=10)
	{
		sum=sum+number;
	number++;	
	}
	System.out.println("The sum of given natural no is:");
	System.out.println(sum);
	}
	}
}
	
