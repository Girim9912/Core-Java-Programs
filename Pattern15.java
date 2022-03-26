import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{int x;
			for(int j=i;j<=n;j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}

	}


}
