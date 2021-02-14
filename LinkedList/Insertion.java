import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
 LinkedList<String> l=new LinkedList<String>();  
           System.out.println("Initial list of elements: "+l);  
           l.add("Seema");  
           l.add("Reenu");  
           l.add("Dimple");  
           System.out.println("After invoking add(E e) method: "+l);  
           
           //Adding an element at the specific position  
           l.add(1, "Nidhi");  
           System.out.println("After invoking add(int index, E element) method: "+l);  
           LinkedList<String> l2=new LinkedList<String>();  
           l2.add("Ruhi");  
           l2.add("Shubham");  
           
           //Adding second list elements to the first list  
           l.addAll(l2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+l);  
           LinkedList<String> l3=new LinkedList<String>();  
           l3.add("Nirbhay");  
           l3.add("Arun"); 
           
           //Adding second list elements to the first list at specific position  
           l.addAll(1, ll3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+l);  
         
         //Adding an element at the first position  
           l.addFirst("Shweta");  
           System.out.println("After invoking addFirst(E e) method: "+l);  
         
         //Adding an element at the last position  
           l.addLast("Kriti");  
           System.out.println("After invoking addLast(E e) method: "+l);  
             
 }  
}  
