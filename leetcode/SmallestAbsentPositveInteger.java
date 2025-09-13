import java.util.*;
class Solution {
    public int smallestAbsent(int[] nums) {
        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        sum/=nums.length;
        Set<Integer> set = new HashSet();
        for(int i:nums){
            if(i>0) set.add(i);
        }

        int avg= Math.max(1,(int) Math.floor(sum) +1);
        while(set.contains(avg)) avg++;

        return avg ;
    }
}