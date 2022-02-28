import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String s1,String s2) {
		int count[]=new int[26];
		for (int i = 0; i < s1.length(); i++) {
		char c=s1.charAt(i);
		if(c>='a'&&c<='z')
			count[c-97]++;
		else if(c>='A'&&c<='Z')
			count[c-65]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char c=s1.charAt(i);
			if(c>='a'&&c<='z')
				count[c-97]--;
			else if(c>='A'&&c<='Z')
				count[c-65]--;
			}
		for (int i = 0; i < 26; i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two Strings");
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.print("it is anagam: ");
		System.out.println(isAnagram(s1,s2));
	}

}
