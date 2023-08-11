package SelfPractise;

import java.util.HashMap;

public class TwoSum {

    static int[] sum(int[] arr,int target){
        HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            Integer diff=(Integer)(target=arr[i]);
            if(hash.containsKey(diff)){
                return new int []{hash.get(diff)+1,i+1};
                
            }
            hash.put(arr[i], i);
        }  
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2,1,9,3,7};
        System.out.println(sum(arr, 5));
    }
}
