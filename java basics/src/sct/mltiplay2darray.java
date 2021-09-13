package sct;

public class mltiplay2darray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};//dec and initi
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];//define row and column is neccessay
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
		
				c[i][j]=0;
				for(int k=0;k<b.length;k++)
				{
					c[i][j]=a[i][k]*b[k][j];//adding
				}
			System.out.print(c[i][j]+" ");	//print
		}
		System.out.println();	
	}

}}
