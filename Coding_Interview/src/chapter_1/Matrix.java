package chapter_1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of matrix: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("Please enter the values of matrix: ");
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int row = 0;
		int col = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++ )
			{
				if(mat[i][j] == 0)
				{
					row = i;
					col = j;
				}
			}
		}
		for(int k = 0;k<n;k++)
		{
			mat[row][k] = 0;
			mat[k][col] = 0;
		}
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.print(mat[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
