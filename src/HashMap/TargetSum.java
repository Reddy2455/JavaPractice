package HashMap;
import java.util.HashMap;
import java.util.Map;


public class TargetSum {

        public static int[] findTwoSum(int[] nums, int target) {
            // Create a HashMap to store the complement value and its index
            Map<Integer, Integer> complementMap = new HashMap<>();

            // Iterate over the array elements
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // Check if the complement is present in the HashMap
                if (complementMap.containsKey(complement)) {
                    // Return the indices of the current element and its complement
                    return new int[]{complementMap.get(complement), i};
                }

                // Store the current element and its index in the HashMap
                complementMap.put(nums[i], i);
            }

            // No solution found
            return new int[0];
        }

        public static void main(String[] args) {
            int[] nums = {10, 20, 30, 40, 50, 60};
            int target = 100;

            int[] result = findTwoSum(nums, target);

            if (result.length == 2) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No two numbers found with the target sum.");
            }
        }
    }

