import java.util.Iterator;
import java.util.Scanner;

public class Matrix {
	int[][]  read() {
int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
return mat;
}
/*	int[][] read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the order of matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		System.out.println("enter the" + m * n + "elements");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}*/

	void dispArray(int mat[][]) {
		System.out.println("-----displaying-------------------");
		for (int i = 0; i < mat.length; i++) {
			for (int j=0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}

	static int sumArray(int mat[][]) {
		System.out.println("--------sum-------------");
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum = sum + mat[i][j];
			}
		}
		return sum;
	}

	
	int[] count(int[][] a) {
		int ec=0,oc=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int counts[]= {ec,oc};
		return counts;
	}
	int bigOfMat(int a[][]) {
		int big=a[0][0];
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						if(big<a[i][j])
							big=a[i][j];
					}
				}
				return big;
	}
	
	int[][] addMatrics(int a[][], int[][] b){
		if(a.length!=b.length||a[0].length!=b[0].length) 
			return null;
		int c[][]=new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
			return c;
	}
	int[] rowWiseBig(int[][] a) {
		int[] rowBig=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int big=a[i][0];
			for (int j = 1; j < a[i].length; j++) {
				if(big<a[i][j])
					big=a[i][j];
				
				
			}
			rowBig[i]=big;
		}
		return rowBig;
	}
	int[] colWiseBig(int[][] a) {

		int[] rowBig=new int[a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			int big=a[i][0];
			for (int j = 1; j < a.length; j++) {
				if(big<a[j][i])
					big=a[j][i];
				
			}
			rowBig[i]=big;
		}
		return rowBig;
	}
	int[] rowWiseSum(int[][] a) {
		int[] s=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				sum=sum+a[i][j];
			}
			s[i]=sum;
		}
		return s;
	}
	
	int[] colWisesSum(int[][] a) {
		int[] s=new int[a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			int sum=0;
			for (int j = 0; j < a.length; j++) {
				sum=sum+a[j][i];
			}
			s[i]=sum;
		}
		return s;
}
	int diagnalWiseSum(int[][] a) {
		int[] s=new int[a.length];
		int big=a[0][0];
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				if(a[i]==a[j]) {
					if(big<a[i][j])
						big=a[i][j];
				}
			}
			
			}
		return big;
	}
	
	int [] diagonalBig(int a[][]){
		
		int pbig=a[0][0],sbig=a[0][a[0].length-1];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
			if(i==j&&a[i][j]>pbig)
				pbig=a[i][j];
			if(i+j==a.length-1 &&a[i][j]>sbig)
				sbig=a[i][j];
			}
		}
		int b[]= {pbig,sbig};
		return b;
	}
	int[][] rowWiseReverse(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length/2; j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=temp;
			}
			
		}
		return mat;
	}
	int[][] colWiseReverse(int [][]m){
		for (int i = 0; i < m.length/2; i++) {
		 for (int j = 0; j < m[i].length; j++) {
			int temp=m[i][j];
			m[i][j]=m[m.length-1-i][j];
			m[m.length-1-i][j]=temp;
		}
			
		}
		return m;
	}
	int[][] transposeMatrix(int m[][]){
		int[][] n=new int[m[0].length][m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[j][i]=m[i][j];
				
			}
			
		}
		return n;
	}
	int[][] rotateGoLeft(int m[][]){
		int x[][]=transposeMatrix(m);
		colWiseReverse(x);
		return x;
	}
}