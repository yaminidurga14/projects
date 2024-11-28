import java.util.ArrayList;

public class addOne {

    public static ArrayList<Integer> oneadd(int[] digits){
        StringBuilder number=new StringBuilder();
        for (int digit:digits){
            number.append(digit);
        }
        int num=Integer.parseInt(number.toString())+1;

        ArrayList<Integer> result=new ArrayList<>();
        for(char c: String.valueOf(num).toCharArray()){
            result.add(c-'0');//accii value 49-48, 50-48, 51-48=1,2,3
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] inputDigits = {1, 2, 3};
        ArrayList<Integer> result = oneadd(inputDigits);
        System.out.println("Output: " + result);
    }
}
