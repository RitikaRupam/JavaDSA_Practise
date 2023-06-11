package Recursion;

public class ArraySearch {
    static int search(int arr[],int index,int value){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==value){
            return index;
        }
        return search(arr, index+1, value);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,3,5,6,8,};
        System.out.println(search(arr, 0, 6));
    }
}
