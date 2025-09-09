class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0 ;
        if(n% 2 != 0) {
            res[i++] = 0;
        }
        int a = 1; 
        while(i<n){
            res[i++] = a ; 
            res[i++] = -a;
            a++;
        }
        return res;

    }
}