import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
			
		{int x;
		
			for(int j=1;j<=n;j++) {
				
				System.out.print((char)(64+j));
				
			}
			System.out.println();
			
		}

	}

}
