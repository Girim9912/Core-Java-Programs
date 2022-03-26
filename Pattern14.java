import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{int x;
			for(int j=1;j<=i;j++) {
				if(j%2==0)
					x=0;
				else
					x=1;
				System.out.print(x+" ");
				
			}
			System.out.println();
			
		}

	}

}
