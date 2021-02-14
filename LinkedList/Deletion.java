import java.util.*;  
public class LinkedList3 {  
  
        public static void main(String [] args)  
        {  
           LinkedList<String> l=new LinkedList<String>();  
           l.add("Seema");  
           l.add("Nidhi");  
           l.add("Isha");  
           l.add("Sahil");  
           l.add("Kriti");  
           l.add("Garima");  
           l.add("Raju");  
           l.add("Sunidhi");  
           l.add("Aarohi");  
           l.add("Ronak");  
           System.out.println("Initial list of elements: "+l);  
         //Removing specific element from arraylist  
              l.remove("Vijay");  
              System.out.println("After invoking remove(object) method: "+l);   
         //Removing element on the basis of specific position  
              l.remove(0);  
              System.out.println("After invoking remove(index) method: "+l);   
              LinkedList<String> l2=new LinkedList<String>();  
              l2.add("Aryan");  
              l2.add("Bhavesh");
              
         // Adding new elements to arraylist  
              l.addAll(l2);  
              System.out.println("Updated list : "+l);   
              
         //Removing all the new elements from arraylist  
              l.removeAll(ll2);  
              System.out.println("After invoking removeAll() method: "+l);   
              
         //Removing first element from the list  
              l.removeFirst();  
              System.out.println("After invoking removeFirst() method: "+l);  
              
          //Removing first element from the list  
              l.removeLast();  
              System.out.println("After invoking removeLast() method: "+l);  
              
          //Removing first occurrence of element from the list  
              l.removeFirstOccurrence("Priya");  
              System.out.println("After invoking removeFirstOccurrence() method: "+l);  
              
          //Removing last occurrence of element from the list  
              l.removeLastOccurrence("Radha");  
              System.out.println("After invoking removeLastOccurrence() method: "+l);  
  
              //Removing all the elements available in the list       
              l.clear();  
              System.out.println("After invoking clear() method: "+l);   
       }  
    }        
