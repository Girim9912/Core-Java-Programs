
public class DoublyLinkedList {
	class Node{
		int data;
		Node next,pre;
		Node(int data){
			this.data=data;
		}	   }
	Node head,tail;
boolean add(int ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=tail=n;
			return true;
			
		}
		tail.next=n;
		n.pre=tail;
		tail=n;
		return true;
}
boolean addFirst(int ele){
	Node n=new Node(ele);
	if(head==null) {
		head=tail=n;
	return true;}
	n.next=head;
	head.pre=n;
	head=n;
	return true;
	}
boolean addAtSpecific(int ele,int in) {
		if(in==0)
				{
			return addFirst(ele);
		}
		Node temp=head;
		while(in>1&&temp!=null) {
			temp=temp.next;
			in--;
		}
		if(temp==null) 
			return false;
		Node n=new Node(ele);
		n.pre=temp;
		n.next=temp.next;
		temp.next=n;
		if(n.next==null)
			tail=n;
		else
			n.next.pre=n;
		return true;
	}
int deleteFirst() {
	if(head==null) {
		System.out.println("not able to delete");
		return 0;
	}
	int data=head.data;
	head=head.next;
	if(head==null)
		tail=null;
	else
		head.pre=null;
	return data;
}
int deleteLast() {
	
	if(head.next==null) 
		return deleteFirst();
	int data=tail.data;
	tail=tail.pre;
	tail.next=null;
	return data;
	
}
int deleteAtSpecific(int in) {
	if(head==null) {
		System.out.println("not able to delete");
	return 0;}
	if(in==0)return deleteFirst();
	Node temp=head;
	while(temp!=null&&in>0) {
	in--;
	temp=temp.next;
	
	}	
	if(temp==null) {
		System.out.println("out of range index");
		return 0;
	}
	temp.pre.next=temp.next;
	if(temp.next!=null)
		temp.next.pre=temp.pre;
	else
		tail=temp.pre;
	return temp.data;
}
void ireverse() {
	Node temp=head;
	while(temp!=null) {
		Node t=temp.next;
		temp.next=temp.pre;
		temp.pre=t;
		temp=t;
	}
	temp=head;
	head=tail;
	tail=temp;
}
public static void main(String[] args) {
		DoubleLinkedList dl=new DoubleLinkedList();
		System.out.println(dl.add(23));
		System.out.println(dl.add(24));
		System.out.println(dl.addFirst(34));
		System.out.println(dl.addFirst(65));
		System.out.println(dl.addFirst(98));
		System.out.println(dl.deleteFirst());
		System.out.println(dl.deleteLast());
		System.out.println(dl.deleteAtIn(2));
		dl.ireverse();
		
	}
}
