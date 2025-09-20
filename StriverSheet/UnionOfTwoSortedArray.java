package DSA_grind_90.StriverSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1= new int[]{1,2,3,4,5};
        int[] nums2= new int[]{1,2,7};
        int[] res=unionArray(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }
     public static int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList();
        int i=0;
        int j=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                if(arr.size()==0) arr.add(nums1[i]);
                else if(arr.get(arr.size()-1)!=nums1[i]){
                    arr.add(nums1[i]);
                }
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                if(arr.get(arr.size()-1)!=nums1[i]){
                    arr.add(nums1[i]);
                }
                i++;
            }else{
                if(arr.get(arr.size()-1)!=nums2[j]){
                    arr.add(nums2[i]);
                }
                j++;
            }
        }

        while(i<nums1.length){
            if(arr.get(arr.size()-1)!=nums1[i]){
                arr.add(nums1[i]);
            }
            i++;
        }

        while(j<nums2.length){
            if(arr.get(arr.size()-1)!=nums2[j]){
                arr.add(nums2[j]);
            }
            j++;
        }

        int[] res=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            res[k]=arr.get(k);
        }

        return res;
    }
}
