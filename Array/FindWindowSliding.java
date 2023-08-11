package Array;

public class FindWindowSliding {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,2,3,1};
        int k=3;
        int x=2;
        int f=0;
        for(int i=0;i<k;i++){
            if(arr[i]==x){
                f++;
            }
        }
        System.out.println("First Frequency="+f);
        for(int j=k;j<arr.length;j++){
            int out=arr[j-k];
            if(out==x){
                f--;
            }
            int in=arr[j];
            if(in==x){
                f++;
            }
            System.out.println("Frequency Count="+f);
        }
        
    }
}
