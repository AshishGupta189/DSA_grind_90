class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double d=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        d=sum/k;
        int a=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[a++];
            sum+=nums[i];
            if((sum/k)> d ) d= sum/k;

        }
        return d;
    }
}