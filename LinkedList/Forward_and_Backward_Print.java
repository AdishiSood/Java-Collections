/*
Given a pointer to the head node of a linked list, print its elements in forward and backward order, separated by hyphen.
If the head pointer is null (indicating the list is empty), don’t print anything.

The functions void forwardPrint() & void backwardPrint() takes the head node of a linked list as a parameter.
*/
import java.util.Scanner;
class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}

class Main
{
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }
  static void forwardPrint(Node head)
{
	if(head != null){
      System.out.print(head.data + "-");
      forwardPrint(head.next);
    }
}

static void backwardPrint(Node head)
{
	if(head != null) {
      backwardPrint(head.next);
      System.out.print(head.data + "-");
    }
}
public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      Node head = null;
      n = Integer.parseInt(s.nextLine().trim());
      while(n > 0)
      {
        m = Integer.parseInt(s.nextLine().trim());
        head = insertEnd(head, m);
        n--;
      }
      forwardPrint(head);
      System.out.print("\n");
      backwardPrint(head);
      System.out.print("\n");
      t--;
    }
  }
}public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      Node head = null;
      n = Integer.parseInt(s.nextLine().trim());
      while(n > 0)
      {
        m = Integer.parseInt(s.nextLine().trim());
        head = insertEnd(head, m);
        n--;
      }
      forwardPrint(head);
      System.out.print("\n");
      backwardPrint(head);
      System.out.print("\n");
      t--;
    }
  }
}
