
public class StackByLinkedList {
class Node{
	Object data;
	Node ne;
	Node(Object data){
		this.data=data;
	}
}
Node he,ta;
int size;
void push(Object data) {
	Node n=new Node(data);
	size++;
	if(he==null) {
		he=ta=n;
		return;
	}
	ta.ne=n;
	ta=n;
	
}
Object pop() {
	if(he==null) {
		System.out.println("stack under flow");
		return null;
	}
	Node temp=he;
	while(temp.ne!=ta)
		temp=temp.ne;//
	
	Object data=ta.data;
	size--;
	if(he==ta) {
	he=ta=null;
	return data;
	}
	temp.ne=null;
	ta=temp;
	return data;
}
public int size() {
	return size;
}
public Object peek()
{
	if(he==null) {
		System.out.println("stack is under flow");
		return null;
	}
	return ta.data;
}
public String toString() {
	String st="";
	Node temp=he;
	while(temp!=null) {
		st=st+temp.data+"-->";
		temp=temp.ne;
	}
	return st;
}
public static void main(String[] args) {
	StackByLinkedList s=new StackByLinkedList();
	s.push(65);
	s.push(89);
	s.push(35);
	s.push(94);
	s.push(83);
System.out.println(s.size());
System.out.println(s.pop());
System.out.println(s.pop());
	
}
}
