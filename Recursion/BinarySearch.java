public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,6,9,11,24,17};
        System.out.println(BS(arr, 0, arr.length-1, 110));
    }

    static int BS(int[] arr,int low,int high,int target){
        if(low>high) return -1;
        int mid = low +(high-low)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target){
            return BS(arr, low, mid-1, target);
        }
        return BS(arr, mid+1, high, target);

    }
}
