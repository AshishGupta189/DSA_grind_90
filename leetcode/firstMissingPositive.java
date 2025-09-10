import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=1;
        Set<Integer> set = new TreeSet<>();
        for(int i:nums){
            if(i>0) set.add(i);
        }
        for(int i:set){
            if(i!=n) return n;
            n++;
        }

        return n;


    }
}