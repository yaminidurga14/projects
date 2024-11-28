import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(14); 
  linkedlist.add(9); 
  linkedlist.add(2002); 
  linkedlist.remove(); 
  linkedlist.addFirst(14); 
  linkedlist.removeFirst(); 
  linkedlist.removeLast();
  System.out.println(linkedlist); 
  System.out.println(linkedlist.getFirst());
  for(Integer value: linkedlist) { 
    System.out.println(value); 
   } 
    }
}
