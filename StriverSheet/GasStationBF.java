class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {
        int section[] = new int[arr.length-1];
        while (k > 0) {
            double maxDis = -1;
            int maxIdx = -1;

            for (int i = 0; i < arr.length - 1; i++) {
                double gap = (arr[i + 1] - arr[i]) / (double) (section[i] + 1);
                if (gap > maxDis) {
                    maxDis = gap;
                    maxIdx = i;
                }
            }

            section[maxIdx] += 1;
            k--;
        }

        double maxDis = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            double gap = (arr[i + 1] - arr[i]) / (double) (section[i] + 1);
            maxDis = Math.max(maxDis, gap);
        }

        return maxDis;

    }
}
