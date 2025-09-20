package DSA_grind_90.StriverSheet;

public class RotateArray {
    public void rotate(int[] arr, int k) {
        int n=arr.length-1;
        k=k%(n+1);
        reverse(arr,0,n-k);
        reverse(arr,n-k+1,n);
        reverse(arr,0,n);
    }

    void reverse(int[] arr,int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
    }
}
