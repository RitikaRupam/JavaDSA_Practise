package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                System.out.println("Sorted");
                return;
            }
            else{
                System.err.println("Not Sorted");
                return;
            }
        }
    }
}
