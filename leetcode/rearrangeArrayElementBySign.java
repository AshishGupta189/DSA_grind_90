class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int k=0;
        for(int i=0,j=0;i<nums.length&&j<nums.length;i=i,j=j){
            while(i<nums.length&&nums[i]<0) i++;
            while(j<nums.length&&nums[j]>0) j++;
            if(k%2==0){
                res[k++]=nums[i++];
                if(i>=nums.length&&j<nums.length){
                    res[k++]=nums[j++];
                }
            }else{
                res[k++]=nums[j++];
            }
        }
        return res;
    }
}