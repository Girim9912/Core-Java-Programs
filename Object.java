
public class Object {
	public static void main(String[] args) {
	Matrix m=new Matrix();
	int a[][]=m.read();
     m.dispArray(a);
     int s=m.sumArray(a);//----------------------------------
     System.out.println("sum of array: "+s);
     System.out.println();
      int cou[]=m.count(a);//------------------------------
      System.out.println("even count is: "+cou[0]);
  	System.out.println("odd count is; "+cou[1]);
  	int big=m.bigOfMat(a);//----------------------------------
  	System.out.println("biggest is : "+big);
  	System.out.println(" addition of two matrixes is: ");
  int resultmat[][]=m.addMatrics(a,a);
  if(resultmat==null)
	  System.out.println("addition not pasible srry");
  else
	  for (int i = 0; i < resultmat.length; i++) {
		  for (int j = 0; j < resultmat[i].length; j++) {
			  System.out.print(resultmat[i][j]+" ");
		}
		System.out.println();
	}
  int[] rB=m.rowWiseBig(a);
  System.out.println("first row bog is: "+rB[0]);
  System.out.println("second row bog is: "+rB[1]);
  System.out.println("third row bog is: "+rB[2]);
  int[] cB=m.colWiseBig(a);
  System.out.println("first col bog is: "+cB[0]);
  System.out.println("second col bog is: "+cB[1]);
  System.out.println("third col bog is: "+cB[2]);

  int rsum[]=m.rowWiseSum(a);
  System.out.println("first row sum is : "+rsum[0]);
  System.out.println("second row sum is : "+rsum[1]);
  System.out.println("third row sum is : "+rsum[2]);

  int csum[]=m.colWisesSum(a);
  System.out.println("first col sum is : "+csum[0]);
  System.out.println("second col sum is : "+csum[1]);
  System.out.println("third col sum is : "+csum[2]);
 int dia=m.diagnalWiseSum(a);
 System.out.println(dia);
  int b[]=m.diagonalBig(a);
  System.out.println("first diagonal big"+b[0]);
  System.out.println("second diagonal big"+b[1]);
  int rs[][]=m.rowWiseReverse(a);
  m.dispArray(rs);
  int cr[][]=m.colWiseReverse(a);
  m.dispArray(cr);
  int[][] tm=m.transposeMatrix(a);
  m.dispArray(tm);
  int[][] r90=m.rotateGoLeft(a);
  m.dispArray(r90);
  
}

	
}