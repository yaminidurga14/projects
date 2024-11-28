import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
  int n=sc.nextInt(); 
  int r=sc.nextInt(); 
   
  int result=fact(n)/fact(n-r)*fact(r); 
  System.out.println( "ncr "+result); 
   result=fact(n)/fact(n-r); 
  System.out.println("npr "+ result); 
 
 } 
 public static int fact(int n) { 
  int f=1; 
  for(int i=1;i<=n;i++) { 
   f=f*i; 
  } 
  return f; 
    }
}
