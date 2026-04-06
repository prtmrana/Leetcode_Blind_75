import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the size of the array: ");

        int[] nums = new int[] { 1, 2, 3, 4, 5
        };

        int target = 3;

        // brute force approach

        /*
         * Complexity Analysis
         * 
         * Time complexity: O(n2).
         * For each element, we try to find its complement by looping through the rest
         * of the array which takes O(n) time. Therefore, the time complexity is O(n2).
         * 
         * Space complexity: O(1).
         * The space required does not depend on the size of the input array, so only
         * constant space is used.
         * 
         */

        long start = System.currentTimeMillis();
        int[] result = twoSumBruteForceApproach(nums, target);

        System.out.println("result "+Arrays.toString(result));
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");

        // optimize way

        /*
         * we can use hashmap
         * 
         */
        long start2 = System.currentTimeMillis();
        System.out.println("optimzed");
        int[] result2 = twoSumOptimizedWay(nums, target);

       System.out.println("result after optimization"+Arrays.toString(result2));
        long end2 = System.currentTimeMillis();

        System.out.println("Time taken after optimization : " + (end2 - start2) + " ms");
    }

    public static int[] twoSumBruteForceApproach(int[] nums, int target) {
        // brute force
        int[] returnArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    returnArray[0] = i;
                    returnArray[1] = j;
                }
            }

        }

        return returnArray;
    }

    // optimal way

    public static int[] twoSumOptimizedWay(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] returnArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem) && map.get(rem) != i) {
                returnArray[0] = i;
                returnArray[1] = map.get(rem);
            }
        }

        return returnArray;
    }
}
