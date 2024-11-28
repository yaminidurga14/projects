import java.util.Arrays;
public class medianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] num1,int[] num2){
        int[] merged=new int[num1.length+ num2.length];
        System.arraycopy(num2, 0, merged, 0, num1.length);
        System.arraycopy(num2, 0, merged, num1.length, num2.length);
        Arrays.sort(merged);
        int n=merged.length;
        if(n%2==1){
            return merged[n/2];
        }
        else{
            return (merged[n/2-1]+merged[n/2])/2.0;
        }

    }
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] num2={6,7};
        System.out.println(findMedianSortedArrays(nums1,num2));
        
    }
}
