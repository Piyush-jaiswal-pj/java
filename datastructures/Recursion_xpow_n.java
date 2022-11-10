package datastructures;

//Print x^n(stack height =n)

//Remember Points
//stack height = no. of level inside the memory

//1)Info  x^n = x*x^2....
//2)"kaam kya krna h" here 
//x,n
//x*x(x^n-1)=x^n
//3)Base CAse x^0=1
//x=0=0 2 base cases

public class Recursion_xpow_n {

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

		int xPownm1 = calPower(x, n - 1);
		int xPown = x * xPownm1;
		return xPown;
	}
}

//memory stack
/*
 * return 
 cp x=2 n=0
 cp x=2 n=1 
 cp x=2 n=2 
 cp x=2 n=3 
 cp x=2 n=4 
 cp x=2 n=5 
 main x=2
 * n=5
 * 
 */
