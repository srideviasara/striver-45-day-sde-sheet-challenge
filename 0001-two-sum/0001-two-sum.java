class Solution {
 
    public int[] twoSum(int[] nums, int target) {
 
        // HashMap to store:
        // Key   -> number
        // Value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
 
        // Traverse array
        for(int i = 0; i < nums.length; i++) {
 
            // Find complement
            int complement = target - nums[i];
 
            // Check if complement already exists
            if(map.containsKey(complement)) {
 
                // Return indices
                return new int[]{map.get(complement), i};
            }
 
            // Store current number and index
            map.put(nums[i], i);
        }
 
        // Default return
        return new int[]{-1, -1};
    }
}