import java.util.Scanner;

public class Pattern9 {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of pattern");
		
int n=s.nextInt();
for(int i=5;i>=1;i--)
{
	for(int j=5;j>=i;j--)
	{
		System.out.print(i);
		
	}
	System.out.println();
}

	}



}
