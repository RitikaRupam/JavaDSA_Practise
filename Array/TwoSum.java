package Array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int sum=arr[i]+arr[j];
        //         if(sum==target){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }
        // return;
        int max=0;
        for(int elem : arr){
            if(elem>max){
                max=elem;
            }
        }
        int hash[]=new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            if(hash[arr[i]]==0){
                int index=target-arr[i];
                hash[index]=i;
            }
            else{
                int secondPair=hash[arr[i]];
                int firstPair=arr[i];
                System.out.println("Two Sum"+firstPair+" "+secondPair);
                return;
            }
        }
    }
}
