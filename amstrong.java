import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String numstring=String.valueOf(n);
        int numdigits=numstring.length();
        int sum=0;
        for(char digitchar:numstring.toCharArray()){
            int digit=Character.getNumericValue(digitchar);
            sum+=Math.pow(digit,numdigits);
        }
        if(n==sum){
            System.out.println("amstrong");
        }else{
            System.out.println("not a amstrong");
        }
    }
}
