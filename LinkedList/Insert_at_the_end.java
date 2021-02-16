/*
Main class
*/

import java.util.LinkedList;
public class Runner {
public static void main(String args[])
{
	LinkList list=new LinkList();
	list.insert(5);
	list.insert(15);
	list.insert(25);
  list.show();
	
}
}
 
/*
Node class 
*/

public class Node
{
int data;
Node next;
}

/*
Linkedlist class
*/
public class LinkList
{
node head;
public void insert(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null)
	{
		head=node;
	}
	else
	{
		node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}

/*
Show() method
*/
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
