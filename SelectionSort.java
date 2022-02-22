
public class SelectionSort {
static void selectionSort(int ar[]) {
	for(int i=0;i<ar.length;i++)
	{
		int min=i;
		for(int j=i+1;j<ar.length;j++) {
			if(ar[j]<ar[min]) {
				min=j;
			}int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
		}
	}
}
public static void main(String[] args) {
	int arr[]= {8,25,13,27,19,22,12,80,25,4};
	selectionSort(arr);
	for (int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
		
}
}
