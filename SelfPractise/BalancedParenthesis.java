package SelfPractise;

import java.util.Stack;

/*
 * This is solved using -> Stack
 */
public class BalancedParenthesis {
    static boolean check(String s){
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.add(c);
            }
            else{
                if(c==']' && stack.peek()!='[')
                return false;
            if(c=='}' && stack.peek()!='{')
                    return false;           
                 if(c==')' && stack.peek()!='(')
                        return false;
                    stack.pop();     
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="({[({}})]})";
        System.out.println(check(s));
    }
}
        