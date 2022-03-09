import java.util.Scanner;

public class AlphabetsPresent {
	
	static int countAlphabets(String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {
		char c=st.charAt(i);
		if(c>='A'&&c<='Z'||c>='a'&&c<='z')
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	String st=sc.nextLine();
	int rs=countAlphabets(st);
	System.out.println(rs);
	}

}
