import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                res[0]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                res[1]=i+1;
            }
        }

        return res;



    }
}