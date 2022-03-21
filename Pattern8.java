import java.util.Scanner;

public class Pattern8 {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of pattern");
		
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	int j=1;
	do {
		System.out.print(j);
		j++;
	
		
	}while(j<=i);
	System.out.println();
}


}}
