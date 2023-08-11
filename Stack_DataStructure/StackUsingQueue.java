package Stack_DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
    static void implement(Stack<Integer> stack){
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int first=stack.peek();
        while(!q1.isEmpty()){
            q1.add(first);
        }
        Queue<Integer> q=new LinkedList<>() ;
        q=q1;
        q1=q2;
        q2=q;
            System.out.println(q1);
        }
        

    
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
       

    }
}
