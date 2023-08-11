package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,20,90,100,1,44};
        int firstlargest=0;
        int secondlargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[firstlargest]){
                firstlargest=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[firstlargest]){
                if(secondlargest==-1){
                    secondlargest=i;
                }
                else if(arr[i]>arr[secondlargest]){
                    secondlargest=i;
                }
            }
        }
        System.out.println("First Largest "+arr[firstlargest]);
        System.out.println("Second Largest "+arr[secondlargest]);
    }
}
