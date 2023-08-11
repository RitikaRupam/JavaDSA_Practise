package Array;

public class RotateArray {

   static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
       int rotation=-3;
       int arr[]={10,20,30,40,50};
       //rotations must be in range
       rotation=rotation%arr.length;
       //rotation negetive
       if(rotation<0){
        rotation=rotation+arr.length;
       }
       reverse(arr, 0,arr.length-rotation-1);
       reverse(arr, arr.length-rotation, arr.length-1); 
       reverse(arr, 0, arr.length-1);
       for(int elem: arr){
        System.out.println(elem+" ");
       }
       System.out.println();
    }
}
