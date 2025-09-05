class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int b = 0;
        for(int i=0,a=0;a<s.length&&i<g.length;i=i,a=a){
            if(g[i]<=s[a]){
                b++;
                a++;i++;
            }else{
                a++;
            }
        }
        return b;
    }
}