import java.util.Scanner;

public class Fibanoci1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n");
		int n=s.nextInt();
		int f1=0,f2=1,count=0;
		int sum=0;
		while(f1<n) {
			if(f1>5)
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}
}
