import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				
				System.out.print((char)(96+i));
				
			}
			System.out.println();
			
		}

	}}
