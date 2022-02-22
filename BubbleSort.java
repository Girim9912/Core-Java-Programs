//sort the array in ascending order by using bubble sort
public class BubbleSort {
static void bubbleSort(int[] ar) {
	for(int i=0;i<ar.length;i++) {
		for(int j=1;j<ar.length-i;j++) {
			if(ar[j-1]>ar[j]) {
				int t=ar[j];
				ar[j]=ar[j-1];
				ar[j-1]=t;
				
			}
		}
	}
}
public static void main(String[] args) {
	int arr[]= {8,25,13,27,19,22,12};
	bubbleSort(arr);
	for (int i:arr)
		System.out.print(" "+i);
}
}
