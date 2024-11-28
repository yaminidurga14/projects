import java.util.Arrays;
import java.util.Scanner;

public class anagarmString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
  String str1=sc.nextLine(); 
  String str2=sc.nextLine();
  if (areAnagrams(str1,str2)) { 
   System.out.println("Anagram Strings"); 
  } 
  else { 
   System.out.println("Not anagram strings"); 
  } 
   
 } 
 public static boolean areAnagrams(String str1,String str2){ 
  if (str1.length()!=str2.length()) { 
   return false; 
  } 
  char[] ch1=str1.toCharArray(); 
  char[] ch2=str2.toCharArray(); 
  Arrays.sort(ch1); 
  Arrays.sort(ch2); 
  return Arrays.equals(ch1, ch2); 

    }
}
