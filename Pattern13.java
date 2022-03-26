import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}

	}
}
