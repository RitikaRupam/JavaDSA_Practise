package SelfPractise;

public class RotateArray {

    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[] arr, int k){
        if(k<0){
        k=k+arr.length;
      }
            k=k%arr.length;
           reverse(arr, 0, arr.length-k-1);
           reverse(arr, arr.length-k,arr.length-1);
           reverse(arr, 0, arr.length-1);
           return;

    }
   
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,2);
        for(int elem : arr){
            System.out.println(elem);
        }
        
        
    }
}
