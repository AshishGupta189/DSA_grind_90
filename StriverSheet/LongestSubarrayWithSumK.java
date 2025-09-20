package DSA_grind_90.StriverSheet;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: whole array from 0 to i
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: check if there was a prefix sum that leaves remainder k
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: store sum in map only if it's not seen before
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

}
