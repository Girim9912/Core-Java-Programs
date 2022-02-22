
public class InsertionSort {
static void insertionSort(int ar[]) {
	for(int i=1;i<ar.length;i++) {
		int key=ar[i];
		int j=i-1;
		while(i>=0&&ar[j]>key) {
			ar[j+1]=ar[j];
			j--;
		}
		ar[j+1]=key;
	}
}
public static void main(String[] args) {
	int arr[]= {8,25,13,27,19,22,12,80,25};
	insertionSort(arr);
	for (int i:arr)
		System.out.print(" "+i);
}
}
