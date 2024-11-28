import java.util.Scanner;

public class countvowel {
    public static void main(String[] args) {
        int vowls=0;
        int consonts=0;
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        for(int k=0;k<text.length();k++){
            char c=text.charAt(k);
            if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
                vowls++;
            }
            else{
                consonts++;
            }

           
        }
        System.out.println(vowls);
        System.out.println(consonts);
    }
}
