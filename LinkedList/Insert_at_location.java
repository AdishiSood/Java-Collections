/*
Main class
*/

import java.util.LinkedList;
public class Runner
{
public static void main(String args[])
{
	LinkList list=new LinkList();
	list.insert(5);
	list.insert(15);
	list.insert(25);
  list.insertAt(2,43);
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
Node head;
public void insertAt(int index,int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(index==0)
	{
		insertAtStart(data);
	}
	Node n=head;
	for(int i=0;i<index-1;i++)
	{
		n=n.next;
	}
	node.next=n.next;
	n.next=node;
	
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
