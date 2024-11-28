import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
      HashSet<Integer> hash=new HashSet<>();
      hash.add(14); 
      hash.add(9); 
      hash.add(2002); 
      System.out.println(hash);   
      boolean contains=hash.contains(14); 
 System.out.println(contains); 
 hash.add(0); 
 for(Integer value:hash) { 
  System.out.println(value); 
 } 
    }
}
