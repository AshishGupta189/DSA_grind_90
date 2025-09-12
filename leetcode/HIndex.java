class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length;i++){
            int h = Math.min(arr[i], arr.length-i);
            max = Math.max(max, h);

        }

        return max;
    }
}