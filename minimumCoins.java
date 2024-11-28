import java.util.ArrayList;
import java.util.List;

public class minimumCoins {
    public static void main(String[] args) {
        int value=70;
        int[] denominators={2000,500,100,50,20,10,5,2,1};
        List<Integer> coinused=new ArrayList<>();
        int numcoins=mincoins(value,denominators,coinused);
        System.out.println(numcoins);
        System.out.println(coinused);

    }
    public static int mincoins(int value,int[] denominators,List<Integer> coinused){
        int count=0;
        for(int coin:denominators){
            while(value>=coin){
                value-=coin;
                coinused.add(coin);
                count++;

            }
        }




        return count;

    }

}
