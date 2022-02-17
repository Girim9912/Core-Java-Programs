
public class SingleLinkedList {
class Node{
	int data;
	Node next;
	Node(int data){
	this.data=data;
	}
}
Node head,tail;
void add(int ele) {
	Node n=new Node(ele);
	if(head==null)
	{
		head=tail=n;
		return;
	}
	tail.next=n;
	tail=n;
	System.out.println("success added");
}
void addFirst(int ele) {
	Node n=new Node(ele);
	if(head==null)
	{
		head=tail=n;
		return;
	}
	n.next=head;
	head=n;
	System.out.println("first added");
	
}
public String toString() {
	Node t=head;
	String st="";
	while(t!=null) {
		st=st+t.data;
		if(t.next!=null)
			st=st+"->";
		t=t.next;
	}
	return st;
}
//-----------------------------------------------------//----------------------------------------------//---------------------------------
void add1(int ele,int in)
{
if(in==0)
 addFirst(ele);
Node temp=head;
while(in>1&&temp!=null)
{
temp=temp.next;
in--;
}
if(temp==null)
{
System.out.println("successfully added ");
return;
}
Node n=new Node(ele);
n.next=temp.next;
temp.next=n;
if(n.next==null)
tail=n;
}

int deleteFirst(int ele)
{
if(head==null)
{
System.out.println("list is empty");
return 0;
}
int el=head.data;
head=head.next;
if(head==null)
tail=null;
return el;
}
int deleteLast(){
if(head==null){
System.out.println("list is empty");
return 0;}
Node temp=head;
Node pre=null;
while(temp.next!=null){
pre=temp;
temp=temp.next;}
if(pre==null)
head=tail=null;
else
{
pre.next=null;
tail=pre;
}return temp.next.data;
}

int delete(int in) {
	if(in==0) 
		return deleteFirst(in);
	
	Node temp=head;
	while(in>1&&temp!=null) {
		temp=temp.next;
		in--;
	}
	
	if(temp.next==null) {
		System.out.println("not possible delete");
		return 0;
	}
	Node t=temp.next;
	temp.next=t.next;
	if(temp.next==null) 
		tail=temp;
		return t.data;
	
}
int returnMiddleValue() {
	Node slow=head;
	Node fast=head;
	while(fast!=null&&fast.next!=null) {
	fast=fast.next.next;
	slow=slow.next;
	}
	return slow.data;
}
public static void main(String[] args) {
	SingleLinkedList sl=new SingleLinkedList();
	sl.add(74);
	sl.add(98);
	sl.add(45);
	sl.addFirst(67);
	System.out.println(sl);
}
}
