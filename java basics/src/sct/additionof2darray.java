package sct;

public class additionof2darray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};//dec and initi
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];//define row and column is neccessay
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];//adding
			System.out.print(c[i][j]+" ");	//print
		}
		System.out.println();	
	}

}}
