import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}
