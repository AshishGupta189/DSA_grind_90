class Solution {
    public int minOperations(String s) {
        int count = 0;

        for(char ch:s.toCharArray()){
            int steps = (26 - (ch-'a'))%26;
            count = Math.max(count,steps);
        }

        return count;
    }
}
