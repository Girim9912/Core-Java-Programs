import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Pattern no");
		int n=sc.nextInt();
		sc.close();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
			System.out.print(" ");	
			}
			for(int z=1;z<=st;z++)
			{
				System.out.print("*");
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		
		
				
	}

}
