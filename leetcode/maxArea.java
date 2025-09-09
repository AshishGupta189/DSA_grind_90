class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        for(int i=0, j=height.length-1;i<height.length&&j>=i;){
            if(height[i]>=height[j]){
                if(height[j]*(j-i)>maxA) maxA = height[j]*(j-i);
                j--;
            }else{
                if(height[i]*(j-i)>maxA) maxA = height[i]*(j-i);
                i++;
            }
        }
        return maxA;
    }
}