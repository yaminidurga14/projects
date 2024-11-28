import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
       HashMap<String,Integer> map=new HashMap<>(); 
      map.put("yamini", 1); 
      map.put("durga", 2); 
      map.put("kr", 3); 
      System.out.println(map); 
      int value=map.get("yamini"); 
      System.out.println(value); 
      map.remove("kr"); 
      map.put("ramar",4); 
      for(String key:map.keySet()) { 
       System.out.println(map.get(key)); 
      }  
    }
}
