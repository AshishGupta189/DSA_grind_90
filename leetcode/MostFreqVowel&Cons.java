import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        int maxV=0;
        int maxC=0;
        Map<Character,Integer> vowel = new HashMap();
        Map<Character,Integer> conso= new HashMap();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
                if(vowel.get(c)>maxV) maxV=vowel.get(c);
            }else{
                conso.put(c,conso.getOrDefault(c,0)+1);
                if(conso.get(c)>maxC) maxC=conso.get(c);
            }
        }
        return maxC+maxV;
    }
}