package Stack_DataStructure;

import java.util.Stack;

public class NextGreater {
     
    static void nextGreater(int [] arr, int n){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=i%n;i++){
            while(!stack.empty() && stack.peek()<=arr[i%n]){
                stack.pop();
            }
            stack.push(arr[i%n]);
        }
        print(arr, n, stack);
        for(int i=0;i<=stack.size();i++){
            System.out.println("Next greater Stack is: "+arr[i]);
        }
    }
    static void print(int [] arr, int n, Stack<Integer> stack){
        for(int i=0;i<=n-1;i++){
            System.out.println("The Original Array Is: "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={1,4,5,3,12};
        nextGreater(arr, arr.length);
    }
}
