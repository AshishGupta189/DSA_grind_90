class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int key=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                key=m.getKey();
            }
        }

        return key;
    }
}