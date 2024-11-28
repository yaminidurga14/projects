public class maxSubArraysum {
   public static int maxSubArraysum(int[] nums){
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int num:nums){
        currentSum+=num;
        maxSum=Math.max(maxSum, currentSum);
        // Reset currentSum if it becomes negative

        if(currentSum<0){
            currentSum=0;
        }
    }
    return maxSum;
   }

    public static void main(String[] args) {
       int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
       System.out.println(maxSubArraysum(nums)); 
    }
}
