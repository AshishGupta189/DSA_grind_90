class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][matrix[i].length-1]){
                if(BS(matrix[i],0,matrix[i].length-1,target)) return true; 
            }
        }
        return false;
    }

    boolean BS(int[] arr,int low,int high,int tar){
        if(low>high) return false;
        int mid=low+(high-low)/2;
        if(arr[mid]==tar) return true;
        else if(arr[mid]>tar) return BS(arr,low,mid-1,tar);
        return BS(arr,mid+1,high,tar);
    }
}