public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,5,9,8,44,56,32}, 56, 0));
    }
    static int find(int arr[],int target,int index){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return find(arr, target, index+1);
    }
}
