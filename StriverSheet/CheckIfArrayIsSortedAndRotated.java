package DSA_grind_90.StriverSheet;

public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int pivot=-1;
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                pivot=i;
                count++;
            }
        }
        if(count > 1) return false;
        if(pivot==-1 || nums[0]>=nums[nums.length-1]) return true;
        return false;

    }
    
}
