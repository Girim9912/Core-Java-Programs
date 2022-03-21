import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j));
				
			}
			
			System.out.println();
		}

	}
}
