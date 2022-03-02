import java.util.Random;
import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("enter the order of the matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat=new int[m][n];
		System.out.println("enter"+m*n+"elementes");
		for(int i=0;i<mat.length;i++)
		{
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=r.nextInt(10);
			}
		}
		
			System.out.println("the matrix elements elements are : ");
			for(int i=0;i<mat.length;i++)
			{
				for (int j = 0; j < mat[i].length; j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
