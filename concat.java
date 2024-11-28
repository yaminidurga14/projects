import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        String a, b, c; 
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter the first string :  "); 
  a=sc.nextLine(); 
  System.out.println("Enter the sec string : "); 
  b=sc.nextLine(); 
  concat obj=new concat(); 
  c=obj.concatt(a,b); 
  System.out.println("new string: "+c); 
   
 } 
 String concatt(String x,String y) { 
  String z; 
  z=x+" "+y; 
  return z;
    }
}
