class Solution {
    public int earliestTime(int[][] tasks) {
        int min=300;
        for(int i=0;i<tasks.length;i++){
            min= Math.min(min,tasks[i][0]+tasks[i][1]);
        }
        return min;
    }
}