import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class matchingChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Set<Character> set1 = new HashSet<>();
        Set<Character> matchingCharacters = new HashSet<>();
        for(char ch:s1.toCharArray()){
            set1.add(ch);

        }
        for (char ch:s2.toCharArray()){
            if(set1.contains(ch)){
                matchingCharacters.add(ch);
            }
        }
        System.out.print("Matching characters are: ");
        for (char ch : matchingCharacters) {
            System.out.print(ch + " ");

    }
}
}
