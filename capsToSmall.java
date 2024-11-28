import java.util.Scanner;

public class capsToSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A') && (ch<='Z'))
                  result.append((char)(ch+32));
            else if((ch>'a')&&(ch<='z'))
                    result.append((char)(ch-32));
            else
                 result.append(ch);
        }
        String ans=result.toString(); 
      System.out.println(ans);
    }
}
