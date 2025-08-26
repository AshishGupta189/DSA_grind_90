class BubbleSort{
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4};
        int n=5;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}