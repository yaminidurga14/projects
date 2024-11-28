import java.util.HashMap;

public class majorityElement {
    public static int findMajorityElement(int[] A) {
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = A.length;

        // Traverse the array and count occurrences
        for (int num : A) {
            // Update the count for the current number
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // Check if the current number is the majority element
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        // Return -1 if no majority element is found (though the problem states it always exists)
        return -1;
    }

    public static void main(String[] args) {
        // Example input
        int[] A = {2, 1, 2};

        // Find and print the majority element
        System.out.println("Majority Element: " + findMajorityElement(A)); // Output: 2
    }
    
}



