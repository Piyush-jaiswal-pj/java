package datastructures;

//Print x^n(stack height = logn)

//Remember Points
//stack height = no. of level inside the memory

//1)Info  x^n = x*x^2....

//x^n =n^n/2 * n^n/2 * x .... n=even power
// here tree heights will be its level
//for odd
//x^5=x^2 * x^ 2 * x simply multiply by x till n/x^n=1
//2)"kaam kya krna h" here 
//x,n
//x*x(x^n-1)=x^n
//3)Base CAse x^0=1
//x=0=0 2 base cases

public class Recursion_xpow_logn {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int ans = calPower(x, n);
		System.out.println(ans);

	}
	public static int calPower(int x, int n) {
		if (n == 0) // base case 1
			return 1;
		if (x == 0) /// base case 2
			return 0;
		//if n is even
		if(n%2==0)
		{
			return calPower(x, n/2)*calPower(x, n/2);
		}
		//if n is odd
		else {
			return calPower(x, n/2)*calPower(x, n/2)*x;
		}

		
	}

}
