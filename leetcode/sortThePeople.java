import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n= names.length;
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        int i=0;
        for(Map.Entry<Integer,String> m : map.entrySet()){
            names[i]=m.getValue();
            i++;
        }
        return names;
    }
}