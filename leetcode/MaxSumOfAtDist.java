class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet();
        for(int i:nums){
            set.add(i);
        }
        int[] arr;
        if(set.size()>=k ) arr=new int[k];
        else arr=new int[set.size()];
        Iterator<Integer> itr = set.descendingIterator();
        int c=0;
        while(itr.hasNext() && c<k){
            arr[c++]=itr.next();
        }
        return arr;
        
    }
}