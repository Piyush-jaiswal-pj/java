package datastructures;


 // FACTORIAL PROGRAM
//Remember Points

//1)Info n =5
//2)"kaam kya krna h" here factorial Finding
//n!=n*(n-1)! and print it
//3)Base CAse (n==1) return 1

public class Recursion_Factorial {

	public static void main(String[] args) {
		int n = 5;
		int ans = calcfactorial(n);
		System.out.println(ans);

	}

	public static int calcfactorial(int n) {

		if (n == 1 || n == 0)
			return 1;

		int fact_nm1 = calcfactorial(n - 1);
		int fact_n = n * fact_nm1;

		return fact_n;

	}

}

//explanation
// main() = n=5 pass in the function
/*
 * Stack memory 
 n=5
 Cf n=1
 Cf n=2
 Cf n=3
 Cf n=4
 Cf n=5
 main n=5 
 */
