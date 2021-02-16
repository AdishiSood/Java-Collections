/*
Node class
*/
public class Node {
int data;
Node next;
}
/*
Runner class
*/
import java.util.LinkedList;

public class Runner {
public static void main(String args[])
{
	LinkList list=new LinkList();
	list.insert(5);
	list.insert(45);
	list.insert(25);
	list.insertAtStart(15);
  list.show();
	
}
}
public class LinkList
{
Node head;
public void insertAtStart(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	node.next=head;
	head=node;
}
public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
