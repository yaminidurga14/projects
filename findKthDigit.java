import java.util.Scanner;

public class findKthDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        int pownum=sc.nextInt(); 
        int digit=sc.nextInt();

        int n=(int)Math.pow(num, pownum);
        n=Math.abs(n);
        for(int i=0;i<digit-1;i++){
            n=n/10;
        }
        int kthDigit=n%10;
        System.out.println(kthDigit);

    }
}
