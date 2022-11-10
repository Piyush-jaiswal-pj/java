package datastructures;

// Fibonnaci PROGRAM 0 1 1 2 3 5 .....
//Remember Points

//1)Info  given a=0;b=1, n=5;
//2)"kaam kya krna h" here fibonaci  Finding to creeate the next term
//c=a+b;!=n*(n-1)! and print it
//3)Base CAse nth term return 1

public class Recursion_Fubonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int a=0;//Secondary last term
		int b=1;// last term
		int n=5;
		System.out.print(a + " " + b);
		fibonacci(a,b,n-2);
		
	}
	public static void fibonacci(int a ,int b,int n) {
		if(n==0)
			return;
	int c=a+b;
	System.out.print(" " + c);
	fibonacci(b, c, n-1);
	
	}

}

//memory stack
/*
 fibonacci (5,8,0) c=13 but base condition is statisfy so it will return
 fibonacci (3,5,1) c=8
 fibonacci (3,3,2) c=5
 fibonacci (1,2,3) c=3
 fibonacci (1,1,4) c=2
 fibonacci (0,1,5) c=1
 
 main( 5 )0 and 1 is already printed
 */

