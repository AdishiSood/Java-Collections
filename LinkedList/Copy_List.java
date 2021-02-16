import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
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
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }
  
static Node copyList(Node org)
{
  Node a=null;
  Node b=null;
 while(org!=null)
  {
    if(a==null)
    {
      a=new Node(org.data);
      b=a;
    }
   else{
     b.next=new Node(org.data);
     b=b.next;
  }
   org=org.next;
 }
  return a;
}
  public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      Node h2 = null;
      n=Integer.parseInt(s.nextLine());
      while(n>0)
      {
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      h2 = copyList(head);
      if(h2!=null && h2==head) System.out.print("Don't be Smart, CodeQuotient is more than you!");
      else forwardPrint(h2);
      System.out.print("\n");
      t--;
    }
  }
}
