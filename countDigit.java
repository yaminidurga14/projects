import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: "); 
  int num=sc.nextInt(); 
  System.out.println("Enter the target Numbder: "); 
  int target=sc.nextInt();
  int count=0; 
  for(int i=0;i<num;i++) { 
   int dig=num%10; 
   if(dig==target) { 
    count++; 
   } 
   num=num/10; 
} 
System.out.println(count);
  
    }
}
