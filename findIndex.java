public class findIndex {

    public static int indx(int[] my_arry,int t){
        if (my_arry == null) return -1; 
        int len = my_arry.length; 
        int i = 0; 
        while (i < len) { 
            if (my_arry[i] == t) return i; 
            else i=i+1;
        }
        return-1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; 
      System.out.println("Index position of 25 is: " + 
indx(my_array, 25)); 
      System.out.println("Index position of 77 is: " + 
indx(my_array, 77)); 
    }
}
