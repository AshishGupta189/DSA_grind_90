class Solution {
    public int removeElement(int[] nums, int val) {
        int size=0;
        for(int i=0,j=0;i<nums.length&&j<nums.length;i=i,j=j){
            if(i<nums.length&&nums[i]!=val){
                i++;j++;
                size++;
            }
            while(j<nums.length&&nums[j]==val){
                j++;
            }
            if(j<nums.length&&nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return size;
    }
}