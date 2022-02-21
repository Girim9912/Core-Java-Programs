//pushing the all zeros to the last of the arry without taking the new array
public class userMain {
static void pushZeroToEnd(int input1[],int input2) {
	int count=0;
	for(int i=0;i<input2;i++) {
		if(input1[i]!=0) {
			input1[count++]=input1[i];}	}
	for(int i=count;i<input2;i++) {
		input1[count++]=0;}
}
public static void main(String[] args) {
	int arr[]= {2,3,0,4,5,0,8};
	int al=7;
	pushZeroToEnd(arr,al);
for(int i=0;i<al;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
for(int j:arr) {
	System.out.print(j);
}
}
}
