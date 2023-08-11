package Array;

public class WindowSliding {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,7,0,8};
        int sum=0;
        int k=3;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int j=k;j<arr.length;j++){
            sum=sum-arr[j-k]+arr[j];    //Sliding Equation
            System.out.println(sum);
        }
        
    }
}
