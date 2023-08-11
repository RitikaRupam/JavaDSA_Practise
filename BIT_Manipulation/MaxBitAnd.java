package BIT_Manipulation;

public class MaxBitAnd {
    public static void main(String[] args) {
        int arr[]={3,5,8,10,12};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int m=arr[i] & arr[j];
                if(m>max){
                    max=m;
                }
            }
        }
        System.out.println();
    }
}
