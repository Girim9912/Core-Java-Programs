import java.util.Scanner;

public class Fibanoci4 {
static 	int returnN_fibNum(int n){
		int f1=0,f2=1;
		while(n>1) {
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n");
		int n=s.nextInt();
		System.out.println(returnN_fibNum(n));
		
	}

}
