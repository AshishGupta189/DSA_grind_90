class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;
            while(a>0){
                if(a%10==0) break;
                a/=10;
            }
            while(b>0){
                if(b%10==0) break;
                b/=10;
            }
            if(a!=0 || b!=0) continue;
            return new int[]{i,n-i};
        }
        return new int[]{0,0};
    }
}