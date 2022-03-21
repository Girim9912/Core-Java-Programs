import java.util.Scanner;

public class Pattern6 {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of pattern");
		
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	int x;
	for(int j=1;j<=n;j++)
	{
		if(i%2==0) 
			x=0;
		else
			x=1;
	
		
		System.out.print(x);
		
		
	}
	System.out.println();
}

	}


}
