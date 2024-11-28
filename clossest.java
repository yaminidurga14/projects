public class clossest {
    static int closestNumber(int N , int M) {
        int prev =N,next = N;
        while(true){
            if (prev%M== 0)return prev;
            if (next%M ==0)return next;
            prev--;
            next++;
        }
}

public static void main(String[] args) {
    int close=closestNumber(13, 4);
    System.out.println(close);
}
}