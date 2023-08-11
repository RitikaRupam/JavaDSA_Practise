package Stack_DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseArray {

    static int[] reverse(int[] arr){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=stack.pop();
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(reverse(arr));
    }
}
