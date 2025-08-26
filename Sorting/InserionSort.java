public class InserionSort {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4};
        int n=5;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
