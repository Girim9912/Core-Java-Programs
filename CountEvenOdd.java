import java.util.Iterator;

public class CountEvenOdd {
	static int[] count(int a[][]) {
		int ec=0,oc=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int counts[]= {ec,oc};
		return counts;
	}
public static void main(String[] args) {
	Matrix m=new Matrix();
	int a[][]=m.read();
	int [] rs=count(a);
	System.out.println("even count is: "+rs[0]);
	System.out.println("odd count is; "+rs[1]);
	
}
}

