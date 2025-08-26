public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={7,1,3,2,5,4,6,9,8};
        int n=9;
        MergeSort(arr,0,n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void MergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid= low+(high-low)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
    int left = low;
    int right = mid+1;
    int j = low; 
    int[] temp = new int[arr.length];

    while(left<=mid && right<=high){
        if(arr[left] < arr[right]){
            temp[j] = arr[left];
            left++;
        } else {
            temp[j] = arr[right];
            right++;
        }
        j++;
    }

    while(left<=mid){
        temp[j] = arr[left];
        left++;
        j++;
    }

    while(right<=high){
        temp[j] = arr[right];
        right++;
        j++;
    }

    for(int i=low;i<=high;i++){
        arr[i] = temp[i];
    }
}

}
