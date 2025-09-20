package DSA_grind_90.StriverSheet;

public class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int slargest=-1;
        int largest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                slargest=largest;
                largest=nums[i];
            }
            if(nums[i]>slargest && nums[i]<largest) slargest=nums[i];
        }
        return slargest;
    }
    
}
