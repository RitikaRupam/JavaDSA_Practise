package Array;
/*
 * Two Pointer Approach
 */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int low=0;
        int high=arr.length-1;
        int temp;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int elem: arr){
            System.out.println(elem);
        }
    }
}