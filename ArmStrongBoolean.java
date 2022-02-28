import java.util.Scanner;

public class ArmStrongBoolean {                  //153,370
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no. you want");
		int n = sc.nextInt();
		sc.close();
		Boolean rs = isArmStrong(n);
		if (rs == true)
			System.out.println(n+"is arm strong");
		else
			System.out.println(n+"its not armstrong");
	}

	
	static boolean isArmStrong(int n) {
		int dc = countDigits(n);
		int sum = 0, temp = n;
		do {
			int r = n % 10;
			sum = sum + pow(r, dc);
			n = n / 10;
		} while (n != 0);
		return sum == temp;
	}
	

	static int countDigits(int x) {
		int count = 0;
		do {
			count++;
			x = x / 10;
		} while (x != 0);
		return count;
	}

	
	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;

	}

}
