class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        List<Integer> list = new ArrayList();
        //1 1 
        for(int k=0;k<nums.length;k=k){
            if(nums[k]==i){
                k++;i++;
            }else if(k>0&&nums[k]!=i&&nums[k]==nums[k-1]){
                k++;
            }else{
                list.add(i);
                i++;
            }
        }
        if(i<=nums.length){
            int a=i-1;
            for(int j=a;j<nums.length;j++){
                list.add(i++);
            }
        }
        return list;

    }
}