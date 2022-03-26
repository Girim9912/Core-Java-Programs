import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=n;n>=1;n--)
		{int x;
			for(int j=n;j<=i;j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}

	}


}
