import java.util.Scanner;

public class AlphabetsPresent2 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
		String st=sc.nextLine();
		char[] ca=st.toCharArray();
		int count=0;
		for(int i=0;i<ca.length;i++)
		{
			if(ca[i]>=65&&ca[i]<=90||ca[i]>=97&&ca[i]<=122) {
				count++;
			}
		}
		System.out.println(count);
	}

}