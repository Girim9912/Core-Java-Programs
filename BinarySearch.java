
public class BinarySearch {
	static int bsearch(int[] arr,int low, int high, int ele) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==ele)
			return mid;
		if(arr[mid]<ele)
		return	bsearch(arr,mid+1,high,ele);
		else
		return	bsearch(arr,low,mid-1,ele);
	}
public static void main(String[] args) {
	int[] ar= {23,45,56,58,64,78,89};
	int ele=83;
	int low=0;
	int high=ar.length-1;
	int re=bsearch(ar,low,high,ele);
	System.out.println(re);
}
}
