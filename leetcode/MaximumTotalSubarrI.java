public class MaximumTotalSubarrI {
    public long maxTotalValue(int[] nums, int k) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int i:nums){
            if(max<i) max=i;
            if(min>i) min=i;
        }
        long res=0;
        for(int i=0;i<k;i++){
            res+=(max-min);
        }
        return res;
    }
}
