class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int[] res=new int[m+n];
        int k=0;
        int j=0;
        for(int i=0;i<(m+n);i=i){
            if(k==(m+n)) break;
            if(j<n&&(i>=m || nums1[i]>nums2[j])){
                res[k++]=nums2[j++];
            }else{
                res[k++]=nums1[i++];
            }
        }
        for(int i=0;i<(m+n);i++){
            nums1[i]=res[i];
        }
    }
}